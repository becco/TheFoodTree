package com.fwa.thefoodtree.db;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class IngredientsDataSource {

	// Database fields
	private SQLiteDatabase database;
	private DatabaseHelper dbHelper;

	String mQuery;

	private String[] allColumns = { DatabaseHelper.COLUMN_ID,
			DatabaseHelper.COLUMN_NAME, DatabaseHelper.COLUMN_METRIC,
			DatabaseHelper.COLUMN_COST_PER_ONE,
			DatabaseHelper.COLUMN_MEASURE_BY_QUANTITY,
			DatabaseHelper.COLUMN_CATEGORY_ID };

	public IngredientsDataSource(Context context) {
		dbHelper = new DatabaseHelper(context);
	}

	public void open() throws SQLException {
		database = dbHelper.getWritableDatabase();
	}

	public void close() {
		dbHelper.close();
	}

	// public Ingredient createIngredient(String name, String metric, double
	// cost, int measureByQuantity, int catId) {
	// ContentValues values = new ContentValues();
	//
	// values.put(MySQLiteHelper.COLUMN_NAME, name);
	// values.put(MySQLiteHelper.COLUMN_METRIC, metric);
	// values.put(MySQLiteHelper.COLUMN_COST_PER_ONE, cost);
	// values.put(MySQLiteHelper.COLUMN_MEASURE_BY_QUANTITY, measureByQuantity);
	// values.put(MySQLiteHelper.COLUMN_CATEGORY_ID, catId);
	//
	//
	// long insertId = database.insert(MySQLiteHelper.TABLE_INGREDIENTS,
	// null,values);
	// Cursor cursor = database.query(MySQLiteHelper.TABLE_INGREDIENTS,
	// allColumns, MySQLiteHelper.COLUMN_ID + " = " + insertId, null,
	// null, null, null);
	// cursor.moveToFirst();
	// Ingredient newIngredient = cursorToIngredient(cursor);
	// cursor.close();
	// return newIngredient;
	// }

	// public void deleteIngredient(Ingredient Ingredient) {
	// long id = Ingredient.getId();
	// System.out.println("Ingredient deleted with id: " + id);
	// database.delete(MySQLiteHelper.TABLE_IngredientS,
	// MySQLiteHelper.COLUMN_ID
	// + " = " + id, null);
	// }

	

//	public List<Ingredient> getAllIngredients() {
//		List<Ingredient> Ingredients = new ArrayList<Ingredient>();
//
//		Cursor cursor = database.query(DatabaseHelper.TABLE_INGREDIENTS,
//				allColumns, query, null, null, null,
//				null);
//		cursor.moveToFirst();
//		while (!cursor.isAfterLast()) {
//			Ingredient Ingredient = cursorToIngredient(cursor);
//			Ingredients.add(Ingredient);
//			cursor.moveToNext();
//		}
//		// make sure to close the cursor
//		cursor.close();
//		return Ingredients;
//	}
	
	public List<Ingredient> getIngredientsRange(String query) {
		List<Ingredient> Ingredients = new ArrayList<Ingredient>();

		Cursor cursor = database.query(DatabaseHelper.TABLE_INGREDIENTS,
				allColumns, query, null, null, null,
				null);
		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
			Ingredient Ingredient = cursorToIngredient(cursor);
			Ingredients.add(Ingredient);
			cursor.moveToNext();
		}
		// make sure to close the cursor
		cursor.close();
		return Ingredients;
	}

	private Ingredient cursorToIngredient(Cursor cursor) {
	   	
	   	int idIndex = cursor.getColumnIndexOrThrow("_id");
        int nameIndex = cursor.getColumnIndexOrThrow("name");
        int metricIndex = cursor.getColumnIndexOrThrow("metric");
        int costIndex = cursor.getColumnIndexOrThrow("cost_per_one");
        int measureIndex = cursor.getColumnIndexOrThrow("measure_by_quantity");
        int catIdIndex = cursor.getColumnIndexOrThrow("category_id");
        
        Log.d("id", Integer.toString(cursor.getInt(idIndex)));
        Log.d("name", cursor.getString(nameIndex));
        Log.d("metric", cursor.getString(metricIndex));
	   	Log.d("costPerOne", Double.toString(cursor.getDouble(costIndex)));
	   	Log.d("measure", Integer.toString(cursor.getInt(measureIndex)));
	   	Log.d("catid", Integer.toString(cursor.getInt(catIdIndex)));
	   	Log.d("", "----------------------");
        
		Ingredient ingredient = new Ingredient(cursor.getInt(idIndex), cursor.getString(nameIndex), cursor.getDouble(costIndex), cursor.getString(metricIndex), cursor.getInt(measureIndex), cursor.getInt(catIdIndex));
		return ingredient;
	}
	
}
