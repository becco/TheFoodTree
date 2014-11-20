package com.fwa.thefoodtree.fragments;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.fwa.thefoodtree.R;

public class CategoriesFragment extends FTFragment {

	private List<String> mDataSourceList = new ArrayList<String>(); 
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {    		
        View rootView = inflater.inflate(R.layout.fragment_categories, container, false);
        
        this.setMainTitle(rootView);
        this.initList(rootView);
        return rootView;
    }
    
    public void setMainTitle(View rootView) {
    	TextView categoriesTitle = (TextView) rootView.findViewById(R.id.categoriesTitle);
    	categoriesTitle.setText(this.getTitle());
    }
    public void initList(View rootView) {
    	//add data to ListView  
        for(int i=0, count=20; i<count; i++){  
            mDataSourceList.add("Item " + i);  
        }  
        //ListView lv = (ListView)getActivity().findViewById(R.id.lv_contact);
    	ListView listView = (ListView) rootView.findViewById(R.id.categoryLV);  
    	Log.d("list", listView.toString());
    	ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.ui_row_item, R.id.textView1, mDataSourceList);
        listView.setAdapter(adapter);
        //listView.setAdapter(new ArrayAdapter(getActivity(), R.layout.ui_row_item, mDataSourceList));  
       // listView.setAdapter(new ArrayAdapter(getActivity(), R.layout.ui_row_item), mDataSourceList));
//        listView.setOnItemClickListener(new OnItemClickListener() {  
//   
//            @Override 
//            public void onItemClick(AdapterView<?> parent, View view,  
//                    int position, long id) {  
//                //create a Fragment  
////                Fragment detailFragment = new FragmentDetail();  
////                   
////               
////                Bundle mBundle = new Bundle();  
////                mBundle.putString("arg", mDataSourceList.get(position));  
////                detailFragment.setArguments(mBundle);  
////                   
////                final FragmentManager fragmentManager = getActivity().getSupportFragmentManager();  
////                final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();  
////                   
////                //check if the device is landscape or portrait 
////                Configuration configuration = getActivity().getResources().getConfiguration();  
////                int ori = configuration.orientation;  
////                   
////                fragmentTransaction.replace(R.id.detail_container, detailFragment);  
////                   
////                if(ori == configuration.ORIENTATION_PORTRAIT){  
////                    fragmentTransaction.addToBackStack(null);  
////                }  
////                   
////                fragmentTransaction.commit();  
//                   
//                   
//            }  
//        });  
    }
}
