package com.fwa.thefoodtree.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fwa.thefoodtree.R;

public class LogMenuFragment extends FTFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {    		
        View rootView = inflater.inflate(R.layout.fragment_log_menu, container, false);
        return rootView;
    }
}
