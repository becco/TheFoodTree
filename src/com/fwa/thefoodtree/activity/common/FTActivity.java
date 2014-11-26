package com.fwa.thefoodtree.activity.common;

import android.app.Activity;
import android.app.FragmentBreadCrumbs;
import android.app.FragmentManager;
import android.app.FragmentManager.OnBackStackChangedListener;
import android.os.Bundle;
import android.util.Log;

import com.fwa.thefoodtree.R;
import com.fwa.thefoodtree.fragments.FTFragment;

/* This is our main activity, everything should extend this */

public class FTActivity extends Activity implements
		FTFragment.OnSwitchFragmentListener,
		OnBackStackChangedListener {

	public FTActivity() {

	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		FragmentManager fragmentManager = getFragmentManager();
	    fragmentManager.addOnBackStackChangedListener(this);
	}
	

	/* @interface Handles swapping in and out fragments */
	@Override
	public void onFragmentSwitched(FTFragment fragment) {
		String title = fragment.getCategoryTitle();//"Log fruit or veg";//args.getString(FTFragment.ARG_CATEGORY_ITEM);
		FragmentManager fragmentManager = getFragmentManager();
		fragmentManager.beginTransaction()
				.replace(R.id.content_frame, fragment)
				.setBreadCrumbTitle(title).setBreadCrumbShortTitle(title)
				.addToBackStack(null).commit();
		
		this.setActionBarTitle(title);
	}
	
	
	/* set title in the action bar */
	public void setActionBarTitle(String title) {
		this.getActionBar().setTitle(title);
	}
	
	/* update the breadcrumbs */
	public void updateBreadCrumbs(FragmentBreadCrumbs breadcrumbs, String title) {
		breadcrumbs.setParentTitle(null, null, null);
		breadcrumbs.setTitle(title, title);
    }
	public void clearBackStack() {
        FragmentManager fm = getFragmentManager();
        while (fm.getBackStackEntryCount() > 0) {
            fm.popBackStackImmediate();
        }
    }

    public void onBackStackChanged() {
//        if (mPauseBackStackWatcher) {
//            return;
//        }
//
//        if (getFragmentManager().getBackStackEntryCount() == 0) {
//            showDetailPane(false);
//        }
//
//        updateBreadCrumbs();
    }
	
    /* Called whenever we call invalidateOptionsMenu() */
//  @Override
//  public boolean onPrepareOptionsMenu(Menu menu) {
//      // If the nav drawer is open, hide action items related to the content view
//      boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
//      //menu.findItem(R.id.action_websearch).setVisible(!drawerOpen);
//      return super.onPrepareOptionsMenu(menu);
//  }
	
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		//getMenuInflater().inflate(R.menu.app, menu);
//		return true;
//	}
		
}
