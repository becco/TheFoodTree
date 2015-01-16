package com.fwa.thefoodtree.account;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class HttpHandler {
	
	String url;
	HttpClient httpclient;
	HttpPost httppost;
	
	public String register(String name, String email, String password) {
		
		url = "http://www.thefoodtree.rebeccarichards.ie/register.php";
		httpclient = new DefaultHttpClient();
	    httppost = new HttpPost(url);
	    String response;

	    try {
	        // Add data
	        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(3);
	        nameValuePairs.add(new BasicNameValuePair("name", name));
	        nameValuePairs.add(new BasicNameValuePair("email", email));
	        nameValuePairs.add(new BasicNameValuePair("password", password));
	        httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

	        ResponseHandler<String> responseHandler=new BasicResponseHandler();
	        response = httpclient.execute(httppost, responseHandler);

	        
	    } catch (ClientProtocolException e) {
	        // TODO Auto-generated catch block
	    	response = "ClientProtocolException "+e.getMessage();
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	    	response = "IOException "+e.getMessage();
	    }
	    return response;

	}
}
