package com.fwa.thefoodtree.fragments;

import java.util.Date;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.fwa.thefoodtree.R;
import com.fwa.thefoodtree.db.Ingredient;
import com.fwa.thefoodtree.db.Item;
import com.fwa.thefoodtree.db.ItemDataSource;
import com.fwa.thefoodtree.db.Reason;
import com.fwa.thefoodtree.db.ReasonsDataSource;
import com.fwa.thefoodtree.ui.FTReasonButton;

public class ItemFragment extends FTFragment {
		
	private View mRootView;
	private Button logButton;
	private TextView otherReason;
	private EditText otherReasonInput;
	private TextView howManyTitle;  
	private EditText howManyInput;
	
	private Ingredient mIngredient;
	private int mId;
	private int mCatId;
	private String mName;
	private String mMetric;
	private double mCostPerOne;
	private int mMeasuredByQuantity;
	
	private int mReasonId;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mRootView = inflater.inflate(R.layout.fragment_item, container, false);
		
		this.setMainTitle(mRootView);
		this.getIngredientDetails();
		this.getReasons();
		this.setupUIElements();
		
		return mRootView;
	}
	
	private void setReasonId(int id) {
		this.mReasonId = id;
	}
	private int getReasonId() {
		return this.mReasonId;
	}
	
	public void setupUIElements() {
		logButton = (Button) mRootView.findViewById(R.id.logButton);
		otherReason = (TextView) mRootView.findViewById(R.id.otherReason);
		otherReasonInput = (EditText) mRootView.findViewById(R.id.otherReasonInput);
		howManyTitle = (TextView) mRootView.findViewById(R.id.howManyTitle);  
		howManyInput = (EditText) mRootView.findViewById(R.id.howManyInput);  
		
		mId = mIngredient.getId();
		mName = mIngredient.getName();
		mCostPerOne = mIngredient.getCostPerOne();
		mCatId = mIngredient.getCategoryId();
		mMeasuredByQuantity = mIngredient.getMeasuredByQuantity();
		mMetric = mIngredient.getMetric();
		
		String muchMany = "much";
		int valuesArrayId;
		
		// How many text view
		String howManyTitleFormat = mRootView.getContext().getString(R.string.how_many_label); 
		String howMany = String.format(howManyTitleFormat, muchMany + " " + mName);
		howManyTitle.setText(howMany);		
		
		if(mMeasuredByQuantity == 1) {
			muchMany = "many";
		}
		
		// Metric dropdown
		if(mMetric == "g") {
			valuesArrayId = R.array.kilogram_choices;
		}
		else {
			valuesArrayId = R.array.litre_choices;
		}
		Spinner metricDropDown = (Spinner) mRootView.findViewById(R.id.metricDropDown);  
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(), valuesArrayId, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		metricDropDown.setAdapter(adapter);
		
		logButton.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {

            	 
            	 double amount = Double.parseDouble(howManyInput.getText().toString());
            	 
            	 double totalCost = mCostPerOne * amount;
            	 
            	 Date date = new Date();
            	 int reasonId = getReasonId();
            	 int otherReason = 0;
            	 
            	 
            	 
            	 ItemDataSource ds = new ItemDataSource(getActivity());
            	 ds.open();
            	 Item item = ds.createItem(mName, totalCost, date.toString(), reasonId, mCatId, mId, otherReason);
            	 
            	 Log.d("SAVED", "======THIS ITEM======");
            	 Log.d("id", Integer.toString(item.getId()));
            	 Log.d("name", item.getName());
            	 Log.d("totalcost", Double.toString(item.getTotalCost()));
            	 Log.d("catid", Integer.toString(item.getCategoryId()));
            	 Log.d("date", item.getDate());
            	 Log.d("reasonid", Integer.toString(item.getReasonId()));
            	 Log.d("otherreason", Integer.toString(item.getOtherReasonId()));
            	 
            	 //Item item = new Item(mName, totalCost, date, reasonId, mCatId, mId, otherReason);
            	 
            	 // save the item
             }
        });
		otherReason.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
		});
	}
	
	public void getIngredientDetails() {
		mIngredient = this.getIngredient();
	}
	
	public void getReasons() {
		ReasonsDataSource dataSource = new ReasonsDataSource(this.getActivity(), null);
		dataSource.open();
		List<Reason> reasons = dataSource.getAllReasons();	
		ViewGroup container = (ViewGroup) mRootView.findViewById(R.id.reasonLayout);
		for(int i = 0; i<reasons.size(); i++) {
			Reason reason = reasons.get(i);
			String name = reason.getName();
			FTReasonButton button = new FTReasonButton(mRootView.getContext());
			button.reasonButtonText.setText(name);
			button.setId(i+1);
			
			button.setOnClickListener(new View.OnClickListener() {
	             public void onClick(View v) {
	            	 setReasonId(v.getId());
	            	 Log.d("reason is: ", Integer.toString(v.getId()));
	             }
	        });
			
			container.addView(button);
		}
	}
}
