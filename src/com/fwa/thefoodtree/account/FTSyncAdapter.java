package com.fwa.thefoodtree.account;

import java.io.IOException;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
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
			
//			String response = this.postToServer(mNotSyncedItems);
//			Log.d("json", response);
//			
//			if(response == "success") {
//				//update the db SET synced = 1
//				mItemDataSource.updateSyncedItems(mNotSyncedItems);
//			}
//			else {
//				
//			}
			
			
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

	        StringEntity se = new StringEntity(json.toString());

	        httpPost.setEntity(se);
	        httpPost.setHeader("Accept", "application/json");
	        httpPost.setHeader("Content-type", "application/json");


	        HttpResponse response = httpClient.execute(httpPost, httpContext); //execute your request and parse response
	        HttpEntity entity = response.getEntity();

	        jsonString = EntityUtils.toString(entity); //if response in JSON format

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    Log.d("my output", jsonString);
	    return jsonString;

	}

}
