package com.fwa.thefoodtree.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fwa.thefoodtree.R;

public class ConfirmationFragment extends FTFragment {
	
	private View mRootView;
	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {    		
	    	mRootView = inflater.inflate(R.layout.fragment_confirmation, container, false);
	        
	    	//this.setMainTitle(mRootView);
	        this.initUI();
//	        this.setupButtons();
	        return mRootView;
	    }
	 
	 public void initUI() {
//		 mListView.setOnItemClickListener(new OnItemClickListener() {  
//			   
//	            @Override 
//	            public void onItemClick(AdapterView<?> parent, View view, int position, long id) { 
//	            	
//	            	Ingredient ingredient = mListValues.get(position);
//	            	
//	            	FTFragment fragment = new ItemFragment();
//	        		Bundle args = new Bundle();
//	        		args.putString(FTFragment.ARG_CATEGORY_ITEM, ingredient.getName());	
//		        	args.putParcelable(FTFragment.SELECTED_ITEM, ingredient);
//	        		fragment.setArguments(args);
//	        		mSwitchFragmentListener.onFragmentSwitched(fragment);   
//	                   
//	            }  
//	        });  
	 }

}
