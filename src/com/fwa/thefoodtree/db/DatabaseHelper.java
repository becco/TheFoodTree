package com.fwa.thefoodtree.db;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseHelper extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "thefoodtree.db";
    private static final int DATABASE_VERSION = 1;
    
    public static final String TABLE_INGREDIENTS = "ingredients";
    
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_NAME = "name";
	public static final String COLUMN_METRIC = "metric";
	public static final String COLUMN_COST_PER_ONE = "cost_per_one";
	public static final String COLUMN_MEASURE_BY_QUANTITY = "measure_by_quantity";
	public static final String COLUMN_CATEGORY_ID = "category_id";
	
	
	

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}