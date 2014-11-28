package com.fwa.thefoodtree.db;

import android.os.Parcel;
import android.os.Parcelable;

public class Ingredient implements Parcelable{

	private int id;
	private String name;
	private String metric;
	private double costPerOne;
	private int measureByQuantity;
	private int categoryId;
	
	public Ingredient(int id, String name, double costPerOne, String metric, int measureByQuantity, int categoryId) {
		this.id = id;
		this.name = name;
		this.metric = metric;
		this.costPerOne = costPerOne;
		this.measureByQuantity = measureByQuantity;
		this.categoryId = categoryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public double getCostPerOne() {
		return costPerOne;
	}

	public void setCostPerOne(double costPerOne) {
		this.costPerOne = costPerOne;
	}

	public int getMeasuredByQuantity() {
		return measureByQuantity;
	}

	public void setMeasureByQuantity(int measureByQuantity) {
		this.measureByQuantity = measureByQuantity;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

}
