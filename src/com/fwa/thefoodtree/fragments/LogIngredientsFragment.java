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

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_log_ingredients, container, false);
		this.setupButtons(rootView);
		return rootView;
	}
	
	/* Setup the category buttons */
	public void setupButtons(View rootView) {
		
		FTCategoryButton categoryFruitAndVeg = (FTCategoryButton) rootView.findViewById(R.id.categoryFruitAndVeg);
		if (categoryFruitAndVeg != null) {
			categoryFruitAndVeg.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Fragment fragment = new CategoriesFragment();
					//set the title for the fragment
					setTitle(fragment, "Log fruit or veg");
					// trigger the fragment switch
					mSwitchFragmentListener.onFragmentSwitched(fragment);
				}
			});
		}
		FTCategoryButton categoryDairy = (FTCategoryButton) rootView.findViewById(R.id.categoryDairy);
		if (categoryDairy != null) {
			categoryDairy.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Fragment fragment = new CategoriesFragment();
					setTitle(fragment, "Log dairy");
					mSwitchFragmentListener.onFragmentSwitched(fragment);
				}
			});
		}
		FTCategoryButton categoryMeat = (FTCategoryButton) rootView.findViewById(R.id.categoryMeat);
		if (categoryMeat != null) {
			categoryMeat.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Fragment fragment = new CategoriesFragment();
					setTitle(fragment, "Log meat");
					mSwitchFragmentListener.onFragmentSwitched(fragment);
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
