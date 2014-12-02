package com.fwa.thefoodtree.account;

import java.io.IOException;
import java.util.Date;

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
			// fetch updates
			// files = NetworkUtilities.fetchFileUpdates(account, authtoken,
			// mLastUpdated);
			// //sync files
			// FileManager.syncFiles(mContext, account.name, files);

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

}
