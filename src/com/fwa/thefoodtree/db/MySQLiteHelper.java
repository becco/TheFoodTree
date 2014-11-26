package com.fwa.thefoodtree.db;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper {

	public static final String TABLE_INGREDIENTS = "ingredients";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_NAME = "name";
	public static final String COLUMN_METRIC = "metric";
	public static final String COLUMN_COST_PER_ONE = "cost_per_one";
	public static final String COLUMN_MEASURE_BY_QUANTITY = "measure_by_quantity";
	public static final String COLUMN_CATEGORY_ID = "category_id";

	private static final String DATABASE_NAME = "thefoodtree.db";
	private static final int DATABASE_VERSION = 1;

	// Database creation sql statement
	private static final String DATABASE_CREATE = "create table "
			+ TABLE_INGREDIENTS + "(" + COLUMN_ID
			+ " integer primary key autoincrement, " + COLUMN_NAME
			+ " text not null, " + COLUMN_METRIC + " text, "
			+ COLUMN_COST_PER_ONE + " REAL not null, "
			+ COLUMN_MEASURE_BY_QUANTITY + " INTEGER not null, "
			+ COLUMN_CATEGORY_ID + " INTEGER not null);";

	public MySQLiteHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL(DATABASE_CREATE);
		Log.d("createdb", "createdb");
		this.populateDB(database);
	}

	public void populateDB(SQLiteDatabase db) {
		//name,cost_per_one,metric,measure_by_quantity,category_id
//		String mCSVfile = "list.csv";
//		AssetManager manager = getActivity().getAssets();
//		InputStream inStream = null;
//		try {
//		     inStream = manager.open(mCSVfile);
//		    } catch (IOException e) {
//		     e.printStackTrace();
//		    }
//
//		 BufferedReader buffer = new BufferedReader(new InputStreamReader(inStream));
//    	FileReader file = new FileReader(list.csv);
//    	BufferedReader buffer = new BufferedReader(file);
//    	String line = "";
//    	String columns = "name, cost_per_one, metric, measure_by_quantity, category_id";
//    	String str1 = "INSERT INTO " + TABLE_INGREDIENTS + " (" + columns + ") values(";
//    	String str2 = ");";
//
//    	db.beginTransaction();
//    	while ((line = buffer.readLine()) != null) {
//    	    StringBuilder sb = new StringBuilder(str1);
//    	    String[] str = line.split(",");
//    	    sb.append("'" + str[0] + "',");
//    	    sb.append(str[1] + "',");
//    	    sb.append(str[2] + "',");
//    	    sb.append(str[3] + "'");
//    	    sb.append(str[4] + "'");
//    	    sb.append(str2);
//    	    db.execSQL(sb.toString());
//    	}
//    	db.setTransactionSuccessful();
//    	db.endTransaction();
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(MySQLiteHelper.class.getName(),
				"Upgrading database from version " + oldVersion + " to "
						+ newVersion + ", which will destroy all old data");
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_INGREDIENTS);
		onCreate(db);
	}

}
