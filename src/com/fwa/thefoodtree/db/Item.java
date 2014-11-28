package com.fwa.thefoodtree.db;

import java.util.Date;


public class Item {
	
	private String name;
	private double totalCost;
	private int categoryId;
	private Date date;
	private int reasonId;
	private boolean otherReason;
	
	public Item(String n, double c, int cid, Date d, int rid, boolean or) {
		this.name = n;
		this.totalCost = c;
		this.categoryId = cid;
		this.date = d;
		this.reasonId = rid;
		this.otherReason = or;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getReasonId() {
		return reasonId;
	}

	public void setReasonId(int reasonId) {
		this.reasonId = reasonId;
	}

	public boolean isOtherReason() {
		return otherReason;
	}

	public void setOtherReason(boolean otherReason) {
		this.otherReason = otherReason;
	}
	
}
