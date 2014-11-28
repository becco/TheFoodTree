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
	
	private int mReasonId;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mRootView = inflater.inflate(R.layout.fragment_item, container, false);
		
		this.setupUIElements();
		this.setMainTitle(mRootView);
		this.getIngredientDetails();
		this.getReasons();
		
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
		
		logButton.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {

            	 String name = mIngredient.getName();
            	 double amount = Double.parseDouble(howManyInput.getText().toString());
            	 double costPerOne = mIngredient.getCostPerOne();
            	 double totalCost = costPerOne * amount;
            	 int catId = mIngredient.getCategoryId();
            	 Date date = new Date();
            	 int reasonId = getReasonId();
            	 boolean otherReason = false;
            	 
            	 Log.d("name", name);
            	 Log.d("amount", Double.toString(amount));
            	 Log.d("totalcost", Double.toString(totalCost));
            	 Log.d("catid", Integer.toString(catId));
            	 Log.d("date", date.toString());
            	 Log.d("reasonid", Integer.toString(reasonId));
            	 Log.d("otherreason", Boolean.toString(otherReason));
            	 
            	 Item item = new Item(name, totalCost, catId, date, reasonId, otherReason);
            	 
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
		
		String metric = mIngredient.getMetric();
		String name = mIngredient.getName();
		double costPerOne = mIngredient.getCostPerOne();
		int isMeasuredByQuantity = mIngredient.getMeasuredByQuantity();
		
		String muchMany = "much";
		
		Log.d("much/many", Integer.toString(isMeasuredByQuantity));
		
		if(isMeasuredByQuantity == 1) {
			Log.d("", "equal to 1");
			muchMany = "much";
		}
		else {
			muchMany = "many";
		}
		
		// How many text view
		
		String howManyTitleFormat = mRootView.getContext().getString(R.string.how_many_label); 
		String howMany = String.format(howManyTitleFormat, muchMany + " " + name);
		howManyTitle.setText(howMany);
		
		// Amount
		
		
		// Metric dropdown
		int valuesArrayId;
		if(metric == "g") {
			valuesArrayId = R.array.kilogram_choices;
		}
		else {
			valuesArrayId = R.array.litre_choices;
		}
		Spinner metricDropDown = (Spinner) mRootView.findViewById(R.id.metricDropDown);  
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(), valuesArrayId, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		metricDropDown.setAdapter(adapter);
		
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
	             }
	        });
			
			container.addView(button);
		}
	}
}
