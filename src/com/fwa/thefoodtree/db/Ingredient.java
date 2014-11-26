package com.fwa.thefoodtree.db;

public class Ingredient {

	private long id;
	private String name;
	private String metric;
	private double costPerOne;
	private boolean measureByQuantity;
	private long categoryId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public boolean isMeasureByQuantity() {
		return measureByQuantity;
	}

	public void setMeasureByQuantity(boolean measureByQuantity) {
		this.measureByQuantity = measureByQuantity;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return name;
	}

	public void setIngredient(String value) {
		this.name = value;
	}

}
