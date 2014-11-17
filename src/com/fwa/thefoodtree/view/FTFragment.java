package com.fwa.thefoodtree.view;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fwa.thefoodtree.R;

public class FTFragment extends Fragment {
	public static final String ARG_MENU_ITEM = "menu_item";

    public FTFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        int i = getArguments().getInt(ARG_MENU_ITEM);
        String menuItem = getResources().getStringArray(R.array.menu_item_array)[i];

        //int imageId = getResources().getIdentifier(planet.toLowerCase(Locale.getDefault()), "drawable", getActivity().getPackageName());
        //((ImageView) rootView.findViewById(R.id.image)).setImageResource(imageId);
        getActivity().setTitle(menuItem);
        return rootView;
    }
}
