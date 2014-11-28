package com.fwa.thefoodtree.db;

import java.util.Date;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class ItemDataSource {

	// Database fields
	private SQLiteDatabase database;
	private DatabaseHelper dbHelper;

	String mQuery;

	private String[] allColumns = { DatabaseHelper.COLUMN_ID,
			DatabaseHelper.COLUMN_NAME, DatabaseHelper.COLUMN_INGREDIENT_ID,
			DatabaseHelper.COLUMN_TOTAL_COST,
			DatabaseHelper.COLUMN_OTHER_REASON_ID,
			DatabaseHelper.COLUMN_REASON_ID,
			DatabaseHelper.COLUMN_DATE,
			DatabaseHelper.COLUMN_CATEGORY_ID };

	public ItemDataSource(Context context) {
		dbHelper = new DatabaseHelper(context);
	}

	public void open() throws SQLException {
		database = dbHelper.getWritableDatabase();
	}

	public void close() {
		dbHelper.close();
	}

	public Item createItem(String name, double cost, String date, int rid, int cid, int ingId, int or) {
		ContentValues values = new ContentValues();


		values.put(DatabaseHelper.COLUMN_NAME, name);
		values.put(DatabaseHelper.COLUMN_INGREDIENT_ID, ingId);
		values.put(DatabaseHelper.COLUMN_TOTAL_COST, cost);
		values.put(DatabaseHelper.COLUMN_OTHER_REASON_ID, or);
		values.put(DatabaseHelper.COLUMN_REASON_ID, rid);
		values.put(DatabaseHelper.COLUMN_DATE, date);
		values.put(DatabaseHelper.COLUMN_CATEGORY_ID, cid);

		long insertId = database.insert(DatabaseHelper.TABLE_ITEMS, null, values);
		
		Cursor cursor = database.query(DatabaseHelper.TABLE_ITEMS,
				allColumns, DatabaseHelper.COLUMN_ID + " = " + insertId, null,
				null, null, null);
		
		cursor.moveToFirst();
		Item newItem = cursorToItem(cursor);
		cursor.close();
		return newItem;
	}

	// public void deleteIngredient(Ingredient Ingredient) {
	// long id = Ingredient.getId();
	// System.out.println("Ingredient deleted with id: " + id);
	// database.delete(MySQLiteHelper.TABLE_IngredientS,
	// MySQLiteHelper.COLUMN_ID
	// + " = " + id, null);
	// }

	// public List<Ingredient> getAllIngredients() {
	// List<Ingredient> Ingredients = new ArrayList<Ingredient>();
	//
	// Cursor cursor = database.query(DatabaseHelper.TABLE_INGREDIENTS,
	// allColumns, query, null, null, null,
	// null);
	// cursor.moveToFirst();
	// while (!cursor.isAfterLast()) {
	// Ingredient Ingredient = cursorToIngredient(cursor);
	// Ingredients.add(Ingredient);
	// cursor.moveToNext();
	// }
	// // make sure to close the cursor
	// cursor.close();
	// return Ingredients;
	// }

	// public List<Item> getIngredientsRange(String query) {
	// List<Ingredient> Ingredients = new ArrayList<Ingredient>();
	//
	// Cursor cursor = database.query(DatabaseHelper.TABLE_INGREDIENTS,
	// allColumns, query, null, null, null,
	// null);
	// cursor.moveToFirst();
	// while (!cursor.isAfterLast()) {
	// Ingredient Ingredient = cursorToIngredient(cursor);
	// Ingredients.add(Ingredient);
	// cursor.moveToNext();
	// }
	// // make sure to close the cursor
	// cursor.close();
	// return Ingredients;
	// }

	private Item cursorToItem(Cursor cursor) {

		int idIndex = cursor.getColumnIndexOrThrow("_id");
		int nameIndex = cursor.getColumnIndexOrThrow("name");
		int totalCostIndex = cursor.getColumnIndexOrThrow("total_cost");
		int ingredientIdIndex = cursor.getColumnIndexOrThrow("ingredient_id");
		int dateIndex = cursor.getColumnIndexOrThrow("date");
		int catIdIndex = cursor.getColumnIndexOrThrow("category_id");
		int reasonIndex = cursor.getColumnIndexOrThrow("reason_id");
		int otherReasonIndex = cursor.getColumnIndexOrThrow("other_reason_id");
		
		Item item = new Item(cursor.getInt(idIndex), cursor.getString(nameIndex), cursor.getDouble(totalCostIndex), cursor.getString(dateIndex), cursor.getInt(reasonIndex),
				cursor.getInt(catIdIndex), cursor.getInt(ingredientIdIndex), cursor.getInt(otherReasonIndex));
		
		
		return item;
	}

}
