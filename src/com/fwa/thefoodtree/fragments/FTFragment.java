package com.fwa.thefoodtree.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.view.View;
import android.widget.TextView;

import com.fwa.thefoodtree.R;
import com.fwa.thefoodtree.db.Ingredient;

public class FTFragment extends Fragment {
	
	/* The menu item arg */
	public static final String ARG_MENU_ITEM = "menu_item";
	public static final String ARG_CATEGORY_ITEM = "category_item";
	public static final String ARG_CATEGORY_QUERY = "category_query";
	public static final String SELECTED_ITEM = "selected_item";
	
	OnSwitchFragmentListener mSwitchFragmentListener;
	OnAddedFragmentListener mAddedFragmentListener;
	

    public FTFragment() {
        // Empty constructor required for fragment subclasses
    }
    
    @Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			mSwitchFragmentListener = (OnSwitchFragmentListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement OnSwitchFragmentListener");
		}
		try {
			mAddedFragmentListener = (OnAddedFragmentListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement OnAddedFragmentListener");
		}
	}
    
    /* Interface for swapping in and out fragments */
    public interface OnSwitchFragmentListener {
        public void onFragmentSwitched(FTFragment fragment);
    }
    /* Interface for swapping in and out fragments */
    public interface OnAddedFragmentListener {
        public void onFragmentAdded(FTFragment fragment);
    }
    /* Get the title of the fragment */
    public String getTitle() {
    	return this.getArguments().getString(ARG_CATEGORY_ITEM);
    }
    /* Get the query for the category */
    public String getCategoryQuery() {
    	return this.getArguments().getString(ARG_CATEGORY_QUERY);
    }
    /* Get the selected ingredient */
    public Ingredient getIngredient() {
    	return this.getArguments().getParcelable(SELECTED_ITEM);
    }
    /* Set the title of the fragment */
    public void setMainTitle(View view) {
    	TextView categoriesTitle = (TextView) view.findViewById(R.id.categoriesTitle);
    	categoriesTitle.setText(this.getTitle());
    }
    
}
