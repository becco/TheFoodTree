package com.fwa.thefoodtree.fragments;

import android.app.Fragment;

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
    
}
