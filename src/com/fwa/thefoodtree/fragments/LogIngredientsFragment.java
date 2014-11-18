package com.fwa.thefoodtree.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fwa.thefoodtree.R;
import com.fwa.thefoodtree.ui.FTCategoryButton;

public class LogIngredientsFragment extends FTFragment {
	
	OnSwitchFragmentListener mSwitchFragmentListener;
	TextView mCategoriesTitle;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_log_ingredients, container, false);
		this.setupButtons(rootView);
		return rootView;
	}
	
	/* Setup the category buttons */
	public void setupButtons(View rootView) {
		
		mCategoriesTitle = (TextView) rootView.findViewById(R.id.categoriesTitle);
		
		FTCategoryButton categoryFruitAndVeg = (FTCategoryButton) rootView.findViewById(R.id.categoryFruitAndVeg);
		if (categoryFruitAndVeg != null) {
			categoryFruitAndVeg.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Fragment fragment = new CategoriesFragment();
				    //Bundle args = new Bundle();
				    //args.putInt(LogIngredientsFragment.ARG_MENU_ITEM, pos);	    
				    //args.putInt(DailyReportFragment.ARG_MENU_ITEM, pos);
				    //fragment.setArguments(args);
					mSwitchFragmentListener.onFragmentSwitched(fragment, "Log fruit or veg");
					mCategoriesTitle.setText("Log fruit or veg");
				}
			});
		}
		FTCategoryButton categoryDairy = (FTCategoryButton) rootView.findViewById(R.id.categoryDairy);
		if (categoryDairy != null) {
			categoryDairy.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Fragment fragment = new CategoriesFragment();
					mSwitchFragmentListener.onFragmentSwitched(fragment, "Log dairy");
					mCategoriesTitle.setText("Log dairy");
				}
			});
		}
		FTCategoryButton categoryMeat = (FTCategoryButton) rootView.findViewById(R.id.categoryMeat);
		if (categoryMeat != null) {
			categoryMeat.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Fragment fragment = new CategoriesFragment();
					mSwitchFragmentListener.onFragmentSwitched(fragment, "Log meat");
					mCategoriesTitle.setText("Log meat");
				}
			});
		}
		
	}
	
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mSwitchFragmentListener = (OnSwitchFragmentListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnSwitchFragmentListener");
        }
    }
}
