package com.fwa.thefoodtree.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fwa.thefoodtree.R;
import com.fwa.thefoodtree.ui.FTCategoryButton;

public class LogIngredientsFragment extends FTFragment implements View.OnClickListener {

	OnSwitchFragmentListener mSwitchFragmentListener;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_log_ingredients,
				container, false);
		this.setupButtons(rootView);
		return rootView;
	}
	
	/* Setup the category buttons */
	public void setupButtons(View rootView) {

		FTCategoryButton categoryVeg = (FTCategoryButton) rootView.findViewById(R.id.categoryVeg);
		categoryVeg.setOnClickListener(this);

		FTCategoryButton categoryBreadAndPasta = (FTCategoryButton) rootView.findViewById(R.id.categoryBreadAndPasta);
		categoryBreadAndPasta.setOnClickListener(this);

		FTCategoryButton categoryDairy = (FTCategoryButton) rootView.findViewById(R.id.categoryDairy);
		categoryDairy.setOnClickListener(this);

		FTCategoryButton categoryFruit = (FTCategoryButton) rootView.findViewById(R.id.categoryFruit);
		categoryFruit.setOnClickListener(this);

		FTCategoryButton categoryCheese = (FTCategoryButton) rootView.findViewById(R.id.categoryCheese);
		categoryCheese.setOnClickListener(this);

		FTCategoryButton categoryHerbsAndCondimants = (FTCategoryButton) rootView.findViewById(R.id.categoryHerbsAndCondimants);
		categoryHerbsAndCondimants.setOnClickListener(this);

		FTCategoryButton categoryMeat = (FTCategoryButton) rootView.findViewById(R.id.categoryMeat);
		categoryMeat.setOnClickListener(this);

		FTCategoryButton categoryFish = (FTCategoryButton) rootView.findViewById(R.id.categoryFish);
		categoryFish.setOnClickListener(this);

		FTCategoryButton categoryBeverages = (FTCategoryButton) rootView.findViewById(R.id.categoryBeverages);
		categoryBeverages.setOnClickListener(this);


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
	}

	@Override
	public void onClick(View v) {
		Fragment fragment = new CategoriesFragment();
		
		switch(v.getId()) {
	        case R.id.categoryVeg:
	        	setTitle(fragment, "Log veg");
	        break;
	        case R.id.categoryBreadAndPasta:
	        	setTitle(fragment, "Log bread and pasta");
	        break;
	        case R.id.categoryDairy:
	        	setTitle(fragment, "Log dairy");
		    break;
	        case R.id.categoryFruit:
	        	setTitle(fragment, "Log fruit");
		    break; 
	        case R.id.categoryCheese:
	        	setTitle(fragment, "Log cheese");
		    break; 
	        case R.id.categoryHerbsAndCondimants:
	        	setTitle(fragment, "Log herbs & condiments");
		    break; 
	        case R.id.categoryMeat:
	        	setTitle(fragment, "Log meat");
		    break; 
	        case R.id.categoryFish:
	        	setTitle(fragment, "Log fish");
		    break; 
	        case R.id.categoryBeverages:
	        	setTitle(fragment, "Log beverages");
		    break; 
		}
		mSwitchFragmentListener.onFragmentSwitched(fragment);
	}
}
