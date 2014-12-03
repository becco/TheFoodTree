package com.fwa.thefoodtree.account;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fwa.thefoodtree.R;

public class FTRegisterActivity extends Activity {
    /** Called when the activity is first created. */
	
	EditText nameText, emailText, passwordText;	
	String mName, mEmail, mPassword; 
	HttpHandler httpHandler;
	private final Handler mHandler = new Handler();
	AccountManager mAccountManager;
	private Thread mAuthThread;
	static DefaultHttpClient mHttpClient;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        
        Button submitButton = (Button) findViewById(R.id.registerSubmit);
        submitButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
            	nameText = (EditText) findViewById(R.id.nameText);  
            	emailText = (EditText) findViewById(R.id.emailText);  
            	passwordText = (EditText) findViewById(R.id.passwordText);
            	mName = nameText.getText().toString();
            	mEmail = emailText.getText().toString();
            	mPassword = passwordText.getText().toString();
            	showProgress();
            	boolean regResult = register(mName, mEmail, mPassword);
            	onRegistrationResult(regResult);
            }
        });
    }
    
    public boolean register(String name, String email, String password) {
		Log.d("my output", "register");
		String url = "http://www.rebeccarichards.ie/thefoodtree/register.php";
		mHttpClient = new DefaultHttpClient();
	    HttpPost httppost = new HttpPost(url);

	    try {
	        // Add data
	        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(3);
	        nameValuePairs.add(new BasicNameValuePair("name", name));
	        nameValuePairs.add(new BasicNameValuePair("email", email));
	        nameValuePairs.add(new BasicNameValuePair("password", password));
	        httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

	        FTAsyncTask task = new FTAsyncTask(this);
	        task.execute(httppost);
	        
	    } catch (IOException e) {
	    	e.printStackTrace();
	    	return false;
	    }
	    return true;
//	    if(response.equalsIgnoreCase("success")) {
//	    	Log.d("my output", "register response: "+response);
//            return true;
//    	}
//    	else {
//    		Log.d("my output", "register response: "+response);
//            return false;
//    	}

	}
    public void onRegistrationResult(boolean result) {
    	Log.d("my output", "onRegistrationResult(" + result + ")");
        hideProgress();
        if (result == true) {
        	//authenticate
        	boolean authResult = authenticate(mEmail, mPassword);
        	onAuthenticationResult(authResult);
        } else {
    		
        }
    }
    public boolean authenticate(String username, String password) {
        	Log.d("my", "authenticating");
            final HttpResponse resp;

            final ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("username", username));
            params.add(new BasicNameValuePair("password", password));
            HttpEntity entity = null;
            try {
            	Log.d("my", "try ent");
                entity = new UrlEncodedFormEntity(params);
            } catch (final UnsupportedEncodingException e) {
                // this should never happen.
                throw new AssertionError(e);
            }
            Log.d("my", "auth uri");
            final HttpPost post = new HttpPost("http://www.rebeccarichards.ie/thefoodtree/auth.php");
            post.addHeader(entity.getContentType());
            post.setEntity(entity);
            //maybeCreateHttpClient();
            //mHttpClient = new DefaultHttpClient();

            try {
//                resp = mHttpClient.execute(post);
//                Log.d("my", resp.getStatusLine().toString());
//                if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                    Log.d("my", "Successful authentication");
//                    return true;
//                } else {
//                    Log.d("my", "Error authenticating" + resp.getStatusLine());
//                    return false;
//                }
            	FTAsyncTask task = new FTAsyncTask(this);
    	        task.execute(post);
            } finally {
                Log.d("my", "getAuthtoken completing");
            }
            return true;
        }
    public void onAuthenticationResult(boolean result) {
    	if(result == true) {
    		Log.d("my", "authenticated!");
    		//add entry in account manager
        	mAccountManager = AccountManager.get(FTRegisterActivity.this);
        	Account account = new Account(mEmail, "com.fwa.thefoodtree");
            mAccountManager.addAccountExplicitly(account, mPassword, null);

            Intent intent = new Intent();
            intent.putExtra(AccountManager.KEY_ACCOUNT_NAME, mEmail);
            intent.putExtra(AccountManager.KEY_ACCOUNT_TYPE, "com.fwa.thefoodtree");
            intent.putExtra(AccountManager.KEY_AUTHTOKEN, mPassword);
        	
            setResult(RESULT_OK, intent);
            finish();
    	}
    	else {
    		setResult(RESULT_CANCELED);
    		finish();
    	}
    }
   
    @Override
    protected Dialog onCreateDialog(int id) {
        final ProgressDialog dialog = new ProgressDialog(this);
        dialog.setMessage("Creating New Account...");
        dialog.setIndeterminate(true);
        dialog.setCancelable(true);
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialog) {
                finish();
            }
        });
        return dialog;
    }
    protected void showProgress() {
        showDialog(0);
    }
    protected void hideProgress() {
        dismissDialog(0);
    }

}