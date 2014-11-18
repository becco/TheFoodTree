package com.fwa.thefoodtree.fragments;

import android.app.Fragment;

public class FTFragment extends Fragment {
	
	/* The menu item arg */
	public static final String ARG_MENU_ITEM = "menu_item";

    public FTFragment() {
        // Empty constructor required for fragment subclasses
    }
    
    //define some interfaces for communication with the activity
    public interface OnSwitchFragmentListener {
        public void onFragmentSwitched(Fragment fragment, String title);
    }
    
}
