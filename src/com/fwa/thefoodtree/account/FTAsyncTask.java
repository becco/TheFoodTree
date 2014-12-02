package com.fwa.thefoodtree.account;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;
import android.util.Log;

public class FTAsyncTask extends AsyncTask<HttpPost, Void, String> {

	private Exception exception;
	private FTRegisterActivity ownerActivity;

	public FTAsyncTask(FTRegisterActivity activity) {
		// keep activity reference
		this.ownerActivity = activity;
		Log.d("my output", "FTAsyncTask");
	}

	@Override
	protected String doInBackground(HttpPost... post) {
		try {
			Log.d("my output", "Try");
			DefaultHttpClient mHttpClient = new DefaultHttpClient();
			ResponseHandler<String> responseHandler = new BasicResponseHandler();
			String response = mHttpClient.execute(post[0], responseHandler);
			Log.d("my output", "register response: " + response);
			// URL url= new URL(urls[0]);
//			if (response.equalsIgnoreCase("success")) {
//				Log.d("my output", "register response: " + response);
//				//return true;
//			} else {
//				Log.d("my output", "register response: " + response);
//				//return false;
//			}
			return response;
		} catch (Exception e) {
			Log.d("my output", "catch");
			this.exception = e;
			return null;
		}
	}

	protected void onPostExecute(HttpPost post) {
		// Check if exception exists.
		if (exception != null) {
			ownerActivity.hideProgress();
			try {
				throw exception;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
