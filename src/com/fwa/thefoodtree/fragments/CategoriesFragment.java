package com.fwa.thefoodtree.fragments;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.fwa.thefoodtree.R;
import com.fwa.thefoodtree.db.Ingredient;
import com.fwa.thefoodtree.db.IngredientsDataSource;
import com.fwa.thefoodtree.fragments.FTFragment.OnSwitchFragmentListener;
import com.fwa.thefoodtree.ui.FTAlphabetButton;

public class CategoriesFragment extends FTFragment implements View.OnClickListener {

	private IngredientsDataSource mDataSource;
	private View mRootView;
	private ListView mListView;
	
	public static final String QUERY_ABC = " AND (name LIKE 'A%' OR name LIKE 'B%' OR name LIKE 'C%')";
	public static final String QUERY_DEF = " AND (name LIKE 'D%' OR name LIKE 'E%' OR name LIKE 'F%')";
	public static final String QUERY_GHI = " AND (name LIKE 'G%' OR name LIKE 'H%' OR name LIKE 'I%')";
	public static final String QUERY_JKL = " AND (name LIKE 'J%' OR name LIKE 'K%' OR name LIKE 'L%')";
	public static final String QUERY_MNO = " AND (name LIKE 'M%' OR name LIKE 'N%' OR name LIKE 'O%')";
	public static final String QUERY_PQRS = " AND (name LIKE 'P%' OR name LIKE 'Q%' OR name LIKE 'R%' OR name LIKE 'S%')";
	public static final String QUERY_TUV = " AND (name LIKE 'T%' OR name LIKE 'U%' OR name LIKE 'V%')";
	public static final String QUERY_WXYZ = " AND (name LIKE 'W%' OR name LIKE 'X%' OR name LIKE 'Y%' OR name LIKE 'Z%')";
	
	public List<Ingredient> mListValues;
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {    		
    	mRootView = inflater.inflate(R.layout.fragment_categories, container, false);
        
    	this.setMainTitle(mRootView);
        this.initList();
        this.setupButtons();
        return mRootView;
    }
   
   public void setupButtons() {
	   FTAlphabetButton abc = (FTAlphabetButton) mRootView.findViewById(R.id.abc);
	   FTAlphabetButton def = (FTAlphabetButton) mRootView.findViewById(R.id.def);
	   FTAlphabetButton ghi = (FTAlphabetButton) mRootView.findViewById(R.id.ghi);
	   FTAlphabetButton jkl = (FTAlphabetButton) mRootView.findViewById(R.id.jkl);
	   FTAlphabetButton mno = (FTAlphabetButton) mRootView.findViewById(R.id.mno);
	   FTAlphabetButton pqrs = (FTAlphabetButton) mRootView.findViewById(R.id.pqrs);
	   FTAlphabetButton tuv = (FTAlphabetButton) mRootView.findViewById(R.id.tuv);
	   FTAlphabetButton wxyz = (FTAlphabetButton) mRootView.findViewById(R.id.wxyz);
	   
	   abc.setOnClickListener(this);
	   def.setOnClickListener(this);
	   ghi.setOnClickListener(this);
	   jkl.setOnClickListener(this);
	   mno.setOnClickListener(this);
	   pqrs.setOnClickListener(this);
	   tuv.setOnClickListener(this);
	   wxyz.setOnClickListener(this);
   }
    public void initList() {
    	
    	mDataSource = new IngredientsDataSource(this.getActivity());
    	mDataSource.open();

    	mListView = (ListView) mRootView.findViewById(R.id.categoryLV);  
    	
    	this.populateListView(this.getCategoryQuery() + QUERY_ABC);
    	
    	mListView.setOnItemClickListener(new OnItemClickListener() {  
   
            @Override 
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) { 
            	
            	Ingredient ingredient = mListValues.get(position);
            	
            	FTFragment fragment = new ItemFragment();
        		Bundle args = new Bundle();
        		args.putString(FTFragment.ARG_CATEGORY_ITEM, ingredient.getName());	
	        	args.putParcelable(FTFragment.SELECTED_ITEM, ingredient);
        		fragment.setArguments(args);
        		mSwitchFragmentListener.onFragmentSwitched(fragment);   
                   
            }  
        });  
    }
   
	@Override
	public void onClick(View v) {
		
		String query = null;
		
		switch(v.getId()) {
	        case R.id.abc:
	        	query = QUERY_ABC;
	        break;
	        case R.id.def:
	        	query = QUERY_DEF;
	        break;
	        case R.id.ghi:
	        	query = QUERY_GHI;
	        break;
	        case R.id.jkl:
	        	query = QUERY_JKL;
	        break;
	        case R.id.mno:
	        	query = QUERY_MNO;
	        break;
	        case R.id.pqrs:
	        	query = QUERY_PQRS;
	        break;
	        case R.id.tuv:
	        	query = QUERY_TUV;
	        break;
	        case R.id.wxyz:
	        	query = QUERY_WXYZ;
	        break;
		}
		query = this.getCategoryQuery() + query;
		
		this.populateListView(query);
	}
	
	public void populateListView(String query) {
		mListValues = mDataSource.getIngredientsRange(query);
    	ArrayAdapter<Ingredient> adapter = new ArrayAdapter<Ingredient>(getActivity(), R.layout.ui_row_item, R.id.textView1, mListValues);
    	mListView.setAdapter(adapter);
    	
    	Log.d("list", mListValues.toString());
	}
	
}
