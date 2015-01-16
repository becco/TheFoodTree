/*
 * Copyright (C) 2010 The Android Open Source Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.fwa.thefoodtree.account;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;

/**
 * Provides utility methods for communicating with the server.
 */
public class NetworkUtilities {
    private static final String TAG = "NetworkUtilities";
    public static final String PARAM_USERNAME = "username";
    public static final String PARAM_PASSWORD = "password";
    public static final String PARAM_UPDATED = "timestamp";
    public static final String USER_AGENT = "AuthenticationService/1.0";
    public static final int REGISTRATION_TIMEOUT = 30 * 1000; // ms
    //public static final String BASE_URL ="https://samplesyncadapter.appspot.com";
    public static final String BASE_URL ="http://rebeccarichards.ie/throw";
    public static final String AUTH_URI = BASE_URL + "/auth.php";
    /*public static final String FETCH_FRIEND_UPDATES_URI =
        BASE_URL + "/fetch_friend_updates";
    public static final String FETCH_STATUS_URI = BASE_URL + "/fetch_status";*/
    private static HttpClient mHttpClient;

    /**
     * Configures the httpClient to connect to the URL provided.
     */
    public static void maybeCreateHttpClient() {
        if (mHttpClient == null) {
            mHttpClient = new DefaultHttpClient();
            final HttpParams params = mHttpClient.getParams();
            HttpConnectionParams.setConnectionTimeout(params,
                REGISTRATION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(params, REGISTRATION_TIMEOUT);
            ConnManagerParams.setTimeout(params, REGISTRATION_TIMEOUT);
        }
    }

    /**
     * Executes the network requests on a separate thread.
     * 
     * @param runnable The runnable instance containing network mOperations to
     *        be executed.
     */
    public static Thread performOnBackgroundThread(final Runnable runnable) {
        final Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    runnable.run();
                } finally {

                }
            }
        };
        t.start();
        return t;
    }
    
   

   
    public static boolean authenticate(String username, String password,
        Handler handler, final Context context) {
    	Log.d("my", "authenticating");
        final HttpResponse resp;

        final ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair(PARAM_USERNAME, username));
        params.add(new BasicNameValuePair(PARAM_PASSWORD, password));
        HttpEntity entity = null;
        try {
        	Log.d("my", "try ent");
            entity = new UrlEncodedFormEntity(params);
        } catch (final UnsupportedEncodingException e) {
            // this should never happen.
            throw new AssertionError(e);
        }
        Log.d("my", "auth uri");
        final HttpPost post = new HttpPost(AUTH_URI);
        post.addHeader(entity.getContentType());
        post.setEntity(entity);
        maybeCreateHttpClient();

        try {
            resp = mHttpClient.execute(post);
            Log.d("my", resp.getStatusLine().toString());
            if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
               
                Log.d(TAG, "Successful authentication");
                
                sendResult(true, handler, context, "authenticate");
                return true;
            } else {
                
                    Log.d(TAG, "Error authenticating" + resp.getStatusLine());
                
                sendResult(false, handler, context, "authenticate");
                return false;
            }
        } catch (final IOException e) {
           
                Log.d(TAG, "IOException when getting authtoken", e);
           
            sendResult(false, handler, context, "authenticate");
            return false;
        } finally {
            
                Log.d(TAG, "getAuthtoken completing");
            
        }
    }

    /**
     * Sends the authentication response from server back to the caller main UI
     * thread through its handler.
     * 
     * @param result The boolean holding authentication result
     * @param handler The main UI thread's handler instance.
     * @param context The caller Activity's context.
     */
    private static void sendResult(final Boolean result, final Handler handler,
        final Context context, String sender) {
        if (handler == null || context == null) {
            return;
        }
        if(sender.equals("register")) {
        	Log.d("my output", "send result");
        	handler.post(new Runnable() {
	            public void run() {
	            	Log.d("my output", "send result running");
	                ((FTRegisterActivity) context).onRegistrationResult(result);
	            }
	        });
        }
        if(sender.equals("login")) {
        	Log.d("my output", "send result login");
        	handler.post(new Runnable() {
	            public void run() {
	            	Log.d("my output", "send result login running");
	                //((ThrowActivity) context).onLoginResult(result);
	            }
	        });
        }
        else {
	        handler.post(new Runnable() {
	            public void run() {
	                ((FTAuthenticatorActivity) context).onAuthenticationResult(result);
	            }
	        });
        }
    }

    public static Thread attemptAuth(final String username,
        final String password, final Handler handler, final Context context) {
        final Runnable runnable = new Runnable() {
            public void run() {
                authenticate(username, password, handler, context);
            }
        };
        // run on background thread.
        return NetworkUtilities.performOnBackgroundThread(runnable);
    }
    
    public static void downloadFile(String name, String type) throws IOException {
    	
    	String url = "http://rebeccarichards.ie/throw/uploads/"+name;
    	Log.d("downloading: ", url);
    	Bitmap image;
    	URL requestURL = new URL(url);
    	URLConnection connection = requestURL.openConnection();
    	InputStream response = connection.getInputStream();
    	
    	image = BitmapFactory.decodeStream(response);
    	
    	FileOutputStream fos = null;
    	fos = new FileOutputStream(Environment.getExternalStorageDirectory().getAbsolutePath()+"/Throw/"+name); 
    	
    	//only JPEGS for the moment
    	image.compress(CompressFormat.JPEG, 75, fos);


    }
    //upload new file to server
//    public static HttpResponse uploadFile(String data, String accountName) throws ClientProtocolException, IOException {
//    	Log.d("my", "uploading: "+data);
//    	HttpClient httpClient = new DefaultHttpClient();
//		MultipartEntity entity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
//		
//		File fileToUpload = new File(data);
//		FileBody fileBody = new FileBody(fileToUpload);
//		entity.addPart("upload_file", fileBody);
//		entity.addPart("username", new StringBody(accountName));
//
//		HttpPost httpPost = new HttpPost("http://www.thefoodtree.rebeccarichards.ie/upload.php");
//		httpPost.setEntity(entity);
//		HttpResponse response = httpClient.execute(httpPost);
//    	return response;
//    }
   
//    public static List<ThrowFile> fetchFileUpdates(Account account, String authtoken, Date lastUpdated) throws JSONException, ParseException, IOException, AuthenticationException {
//        
//    	final ArrayList<ThrowFile> fileList = new ArrayList<ThrowFile>();
//        final ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
//        params.add(new BasicNameValuePair(PARAM_USERNAME, account.name));
//        params.add(new BasicNameValuePair(PARAM_PASSWORD, authtoken));
//        
//        if (lastUpdated != null) {
//            final SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm");
//            formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
//            params.add(new BasicNameValuePair(PARAM_UPDATED, formatter.format(lastUpdated)));
//            params.add(new BasicNameValuePair("username", account.name));
//        }
//        Log.i(TAG, params.toString());
//
//        HttpEntity entity = null;
//        entity = new UrlEncodedFormEntity(params);
//        final HttpPost post = new HttpPost("http://rebeccarichards.ie/throw/list.php");
//        post.addHeader(entity.getContentType());
//        post.setEntity(entity);
//        maybeCreateHttpClient();
//
//        final HttpResponse resp = mHttpClient.execute(post);
//        final String response = EntityUtils.toString(resp.getEntity());
//
//        if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//        	Log.d("my", "ok");
//            final JSONArray files = new JSONArray(response);
//            Log.d(TAG, response);
//            for (int i = 0; i < files.length(); i++) {
//            	fileList.add(ThrowFile.valueOf(files.getJSONObject(i)));
//            }
//        } else {
//            if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_UNAUTHORIZED) {
//                Log.e(TAG, "Authentication exception in fetching remote contacts");
//                throw new AuthenticationException();
//            } else {
//                Log.e(TAG, "Server error in fetching remote contacts: " + resp.getStatusLine());
//                throw new IOException();
//            }
//        }
//        return fileList;
//    }

   

}
