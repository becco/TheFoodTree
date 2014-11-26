package com.fwa.thefoodtree.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;

public class FTFragment extends Fragment {
	
	/* The menu item arg */
	public static final String ARG_MENU_ITEM = "menu_item";
	public static final String ARG_CATEGORY_ITEM = "category_item";
	public static final String ARG_CATEGORY_QUERY = "category_query";
	

    public FTFragment() {
        // Empty constructor required for fragment subclasses
    }
    
    /* Interface for swapping in and out fragments */
    public interface OnSwitchFragmentListener {
        public void onFragmentSwitched(FTFragment fragment);
    }
    /* Get the title of the fragment */
    public String getCategoryTitle() {
    	return this.getArguments().getString(ARG_CATEGORY_ITEM);
    }
    /* Get the query for the category */
    public String getCategoryQuery() {
    	return this.getArguments().getString(ARG_CATEGORY_QUERY);
    }
    
}
