package com.fwa.thefoodtree.db;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseHelper extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "thefoodtree.db";
    private static final int DATABASE_VERSION = 1;
    
    // tables
    public static final String TABLE_INGREDIENTS = "ingredients";
    public static final String TABLE_REASONS = "reasons";
    public static final String TABLE_ITEMS = "items";
    
    // Ingredients table columns
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_NAME = "name";
	public static final String COLUMN_METRIC = "metric";
	public static final String COLUMN_COST_PER_ONE = "cost_per_one";
	public static final String COLUMN_MEASURE_BY_QUANTITY = "measure_by_quantity";
	public static final String COLUMN_CATEGORY_ID = "category_id";
	
	// Item table columns
	public static final String COLUMN_INGREDIENT_ID = "ingredient_id";
	public static final String COLUMN_TOTAL_COST = "total_cost";
	public static final String COLUMN_DATE = "date";
	public static final String COLUMN_REASON_ID = "reason_id";
	public static final String COLUMN_OTHER_REASON_ID = "other_reason_id";
	
	

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}