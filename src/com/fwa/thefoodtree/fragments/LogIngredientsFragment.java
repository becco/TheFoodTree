package com.fwa.thefoodtree.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fwa.thefoodtree.R;
import com.fwa.thefoodtree.ui.FTCategoryButton;

public class LogIngredientsFragment extends FTFragment implements View.OnClickListener {

	
	
	public static final String QUERY_GET_VEG = "category_id=1";
	public static final String QUERY_GET_BREAD_AND_PASTA = "category_id=2";
	public static final String QUERY_GET_DAIRY = "category_id=3";
	public static final String QUERY_GET_FRUIT = "category_id=4";
	public static final String QUERY_GET_CHEESE = "category_id=5";
	public static final String QUERY_GET_HERBS_AND_CONDIMENTS = "category_id=6";
	public static final String QUERY_GET_FISH = "category_id=7";
	public static final String QUERY_GET_MEAT = "category_id=8";
	public static final String QUERY_GET_BEVERAGES = "category_id=9";

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
	public void onClick(View v) {
		FTFragment fragment = new CategoriesFragment();
		Bundle args = new Bundle();
		switch(v.getId()) {
	        case R.id.categoryVeg:
	        	args.putString(FTFragment.ARG_CATEGORY_ITEM, "Log veg");	
	        	args.putString(FTFragment.ARG_CATEGORY_QUERY, QUERY_GET_VEG);	
	        break;
	        case R.id.categoryBreadAndPasta:
	        	args.putString(FTFragment.ARG_CATEGORY_ITEM, "Log bread and pasta");	
	        	args.putString(FTFragment.ARG_CATEGORY_QUERY, QUERY_GET_BREAD_AND_PASTA);	
	        break;
	        case R.id.categoryDairy:
	        	args.putString(FTFragment.ARG_CATEGORY_ITEM, "Log dairy");	
	        	args.putString(FTFragment.ARG_CATEGORY_QUERY, QUERY_GET_DAIRY);
		    break;
	        case R.id.categoryFruit:
	        	args.putString(FTFragment.ARG_CATEGORY_ITEM, "Log fruit");	
	        	args.putString(FTFragment.ARG_CATEGORY_QUERY, QUERY_GET_FRUIT);
		    break; 
	        case R.id.categoryCheese:
	        	args.putString(FTFragment.ARG_CATEGORY_ITEM, "Log cheese");	
	        	args.putString(FTFragment.ARG_CATEGORY_QUERY, QUERY_GET_CHEESE);
		    break; 
	        case R.id.categoryHerbsAndCondimants:
	        	args.putString(FTFragment.ARG_CATEGORY_ITEM, "Log herbs & condiments");	
	        	args.putString(FTFragment.ARG_CATEGORY_QUERY, QUERY_GET_HERBS_AND_CONDIMENTS);
		    break; 
	        case R.id.categoryMeat:
	        	args.putString(FTFragment.ARG_CATEGORY_ITEM, "Log meat");	
	        	args.putString(FTFragment.ARG_CATEGORY_QUERY, QUERY_GET_MEAT);
		    break; 
	        case R.id.categoryFish:
	        	args.putString(FTFragment.ARG_CATEGORY_ITEM, "Log fish");	
	        	args.putString(FTFragment.ARG_CATEGORY_QUERY, QUERY_GET_FISH);
		    break; 
	        case R.id.categoryBeverages:
	        	args.putString(FTFragment.ARG_CATEGORY_ITEM, "Log beverages");	
	        	args.putString(FTFragment.ARG_CATEGORY_QUERY, QUERY_GET_BEVERAGES);
		    break; 
		}
		fragment.setArguments(args);
		mSwitchFragmentListener.onFragmentSwitched(fragment);
	}
}
