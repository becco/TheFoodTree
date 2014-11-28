package com.fwa.thefoodtree.db;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class ReasonsDataSource {

	// Database fields
	private SQLiteDatabase database;
	private DatabaseHelper dbHelper;

	String mQuery;

	private String[] allColumns = { DatabaseHelper.COLUMN_ID,
			DatabaseHelper.COLUMN_NAME};

	public ReasonsDataSource(Context context, String query) {
		dbHelper = new DatabaseHelper(context);
		mQuery = query;
	}

	public void open() throws SQLException {
		database = dbHelper.getWritableDatabase();
	}

	public void close() {
		dbHelper.close();
	}


	public List<Reason> getAllReasons() {
		List<Reason> reasons = new ArrayList<Reason>();

		Cursor cursor = database.query(DatabaseHelper.TABLE_REASONS,
				allColumns, this.mQuery, null, null, null,
				null);
		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
			Reason reason = cursorToReason(cursor);
			reasons.add(reason);
			cursor.moveToNext();
		}
		// make sure to close the cursor
		cursor.close();
		return reasons;
	}
	
	

	private Reason cursorToReason(Cursor cursor) {
		Reason reason = new Reason();
		reason.setId(cursor.getLong(0));
		reason.setReason(cursor.getString(1));
		return reason;
	}
}
