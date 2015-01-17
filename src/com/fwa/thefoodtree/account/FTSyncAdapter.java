package com.fwa.thefoodtree.account;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.util.Log;

import com.fwa.thefoodtree.db.ItemDataSource;

public class FTSyncAdapter extends AbstractThreadedSyncAdapter {

	ContentResolver mContentResolver;

	private static final String TAG = "SyncAdapter";

	private final AccountManager mAccountManager;
	private final Context mContext;
	private ContentResolver mResolver;

	private Date mLastUpdated;

	public FTSyncAdapter(Context context, boolean autoInitialize) {
		super(context, autoInitialize);
		mContext = context;
		mAccountManager = AccountManager.get(context);

	}

	@Override
	public void onPerformSync(Account account, Bundle extras, String authority,
			ContentProviderClient provider, SyncResult syncResult) {
		Log.d("my", "syncing!");
		// mResolver = mContext.getContentResolver();
		String authtoken = null;
		// List<ThrowFile> files;
		try {
			// get auth token
			authtoken = mAccountManager.blockingGetAuthToken(account,
					"com.fwa.thefoodtree", true);
			//grab crap from db here
			ItemDataSource mItemDataSource =  new ItemDataSource(mContext);
			mItemDataSource.open();
			JSONArray mNotSyncedItems = mItemDataSource.getNotSyncedItemsJSON();
			Log.d("json", mNotSyncedItems.toString());
			Log.d("json", Integer.toString(mNotSyncedItems.length()));
			
			if(mNotSyncedItems.length() > 0) {
				String response = this.postToServer(mNotSyncedItems);
				Log.d("json", response);
				
				if(response.equals("success")) {
					//update the db SET synced = 1
					Log.d("my output", "update the db");
					mItemDataSource.updateSyncedItems(mNotSyncedItems);
				}
				else {
//					Log.d("my output", "update the db");
//					mItemDataSource.updateSyncedItems(mNotSyncedItems);
				}
			}
			
			
			
		} catch (OperationCanceledException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AuthenticatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// } catch (AuthenticationException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (ParseException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// } catch (JSONException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// update the last synced date.
			mLastUpdated = new Date();
		}
	}
	
//  public static HttpResponse uploadFile(String data, String accountName) throws ClientProtocolException, IOException {
//	Log.d("my", "uploading: "+data);
//	HttpClient httpClient = new DefaultHttpClient();
//	MultipartEntity entity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
//	
//	File fileToUpload = new File(data);
//	FileBody fileBody = new FileBody(fileToUpload);
//	entity.addPart("upload_file", fileBody);
//	entity.addPart("username", new StringBody(accountName));
//
//	HttpPost httpPost = new HttpPost("http://www.thefoodtree.rebeccarichards.ie/upload.php");
//	httpPost.setEntity(entity);
//	HttpResponse response = httpClient.execute(httpPost);
//	return response;
//}
	
	public String postToServer(JSONArray json) {
		Log.d("my output", "postToServer");
		String url = "http://www.thefoodtree.rebeccarichards.ie/add.php";
	    HttpPost httpPost = new HttpPost(url);
	    HttpClient httpClient = new DefaultHttpClient();
	    HttpContext httpContext = new BasicHttpContext();
	    String jsonString = null;
	    try {
	    	
//	        StringEntity se = new StringEntity(json.toString());
//
//	        httpPost.setEntity(se);
//	        httpPost.setHeader("Accept", "application/json");
//	        httpPost.setHeader("Content-type", "application/json");
//
//	        Log.d("my output", "try "+se);
//	        
//	        HttpResponse response = httpClient.execute(httpPost, httpContext); //execute your request and parse response
//	        HttpEntity entity = response.getEntity();
//
//	        jsonString = EntityUtils.toString(entity); //if response in JSON format
//	        
//	        Log.d("my output", "jsonString: "+jsonString);
//	        Log.d("response", response.toString());
//	        Log.d("entity", entity.toString());
	    	// url where the data will be posted
	    	
	    	 
	    	// add your data
	    	List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
	    	nameValuePairs.add(new BasicNameValuePair("json", json.toString()));
	    	 
	    	httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
	    	 
	    	// execute HTTP post request
	    	HttpResponse response = httpClient.execute(httpPost);
	    	HttpEntity resEntity = response.getEntity();
	    	 
	    	//if (resEntity != null) {
	    	     
	    	jsonString = EntityUtils.toString(resEntity).trim();
	    	     
	    	    // you can add an if statement here and do other actions based on the response
	    	//}

	    } catch (Exception e) {
	    	Log.d("my output", "catch "+e.toString());
	        e.printStackTrace();
	    }
	    Log.d("my output", "jsonString: "+jsonString);
	    return jsonString;

	}

}
