package com.jspiders.sqlitedemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBoperations extends SQLiteOpenHelper {

	String createtableqry = "create table List (PiD INTEGER primary key AUTOINCREMENT,Name Text);";
	
	public DBoperations(Context context) 
	{
		super(context,"DB1",null,1);
		
		
		Log.d("[DEBUG]", "DB Created ");
	}

	@Override
	public void onCreate(SQLiteDatabase sqldb) 
	{
		sqldb.execSQL(createtableqry);
		Log.d("[DEBUG]", "Table created");	
	}

	public void insertdata(String inputdata, DBoperations db )
	{
		SQLiteDatabase sqldb = db.getWritableDatabase();	
	
		ContentValues values = new ContentValues();
		
		values.put("Name", inputdata);
		
		//sqldb.insert(table, nullColumnHack, values);
		sqldb.insert("List","n/a", values);
			
	}
	
	
	public Cursor retriveinfo(DBoperations db)
	{
		
		SQLiteDatabase sqldb = db.getReadableDatabase(); 
		
		String[] columns = {"Name"};
		
		Cursor cursor= sqldb.query("List", columns, null,null,null,null,null);
		//sqldb.query(table, columns, selection, selectionArgs, groupBy, having, orderBy)
		
		return cursor;
	}
	
	public void updateproduct(DBoperations dbo,int ID,String inputdata)
	{
		SQLiteDatabase sqldb = dbo.getWritableDatabase();
		sqldb.execSQL("update list set name ="+ "'"+inputdata+"'" + " where PiD ="+ID);
		
	}
	
	
	public void deleteproduct(DBoperations dbo,int ID)
	{
		SQLiteDatabase sqldb = dbo.getWritableDatabase();
		sqldb.execSQL("delete from list where Pid = "+ID);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) 
	{
		
	}

}
