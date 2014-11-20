package com.fwa.thefoodtree.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fwa.thefoodtree.R;

public class CategoriesFragment extends FTFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {    		
        View rootView = inflater.inflate(R.layout.fragment_categories, container, false);
        
        this.setMainTitle(rootView);
        
        return rootView;
    }
    
    public void setMainTitle(View rootView) {
    	TextView categoriesTitle = (TextView) rootView.findViewById(R.id.categoriesTitle);
    	categoriesTitle.setText(this.getTitle());
    }
    public void initList() {
    	
    }
}
