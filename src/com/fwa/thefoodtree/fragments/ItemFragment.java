package com.fwa.thefoodtree.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fwa.thefoodtree.R;
import com.fwa.thefoodtree.db.Ingredient;

public class ItemFragment extends FTFragment {
		
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_item, container, false);
		
		this.setMainTitle(rootView);
		this.getIngredientDetails();
		
		return rootView;
	}
	
	public void getIngredientDetails() {
		Ingredient ingredient = this.getIngredient();
		
		Log.d("ingredient", ingredient.getName());
	}
	
}
