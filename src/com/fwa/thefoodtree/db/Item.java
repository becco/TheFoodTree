package com.fwa.thefoodtree.db;



public class Item {
	
	private int id;
	private int ingredientId;
	private String name;
	private double totalCost;
	private int categoryId;
	private String date;
	private int reasonId;
	private int otherReasonId;
	
	public Item(int id, String n, double c, String d, int rid, int cid, int ingId, int or) {
		this.id = id;
		this.name = n;
		this.totalCost = c;
		this.categoryId = cid;
		this.date = d;
		this.reasonId = rid;
		this.otherReasonId = or;
		this.ingredientId = ingId;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(int ingredientId) {
		this.ingredientId = ingredientId;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCostPerOne() {
		return totalCost;
	}

	public void setCostPerOne(double costPerOne) {
		this.totalCost = costPerOne;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getReasonId() {
		return reasonId;
	}

	public void setReasonId(int reasonId) {
		this.reasonId = reasonId;
	}

	public int getOtherReasonId() {
		return otherReasonId;
	}

	public void setOtherReasonId(int otherReason) {
		this.otherReasonId = otherReason;
	}
	
}
