package com.fwa.thefoodtree.fragments;

import android.app.Fragment;
import android.os.Bundle;

public class FTFragment extends Fragment {
	
	/* The menu item arg */
	public static final String ARG_MENU_ITEM = "menu_item";
	public static final String ARG_CATEGORY_ITEM = "category_item";

    public FTFragment() {
        // Empty constructor required for fragment subclasses
    }
    
    /* Interface for swapping in and out fragments */
    public interface OnSwitchFragmentListener {
        public void onFragmentSwitched(Fragment fragment);
    }
    
    /* Interface for swapping in and out fragments */
    public interface OnSetCategoryTitleListener {
        public void oncategoryTitleSet(String title);
    }
    
    /* Set a string bundle argument */
    public void setStringArgument(Fragment fragment, String key, String value) {
    	Bundle args = new Bundle();
	    args.putString(key, value);	    
	    fragment.setArguments(args);
    }
    /* Set the title of the fragment */
    public void setTitle(Fragment fragment, String value) {
    	setStringArgument(fragment, ARG_CATEGORY_ITEM, value);
    }
    /* Get the title of the fragment */
    public String getTitle() {
    	return this.getArguments().getString(ARG_CATEGORY_ITEM);
    }
    
}
