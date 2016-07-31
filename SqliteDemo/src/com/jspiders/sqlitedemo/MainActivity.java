package com.jspiders.sqlitedemo;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {

	EditText inputeditext,updateidedittext;
	Button adddatabutton,displaydatabuttn,updatebutton;
	ListView listviewname;
	private ArrayList<String> namelist; 
	
	Context context = MainActivity.this;
	DBoperations dbo = new DBoperations(context);


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		namelist = new ArrayList<String>();
		inputeditext = (EditText) findViewById(R.id.editText1);
		adddatabutton = (Button) findViewById(R.id.buttonadd);
		displaydatabuttn = (Button) findViewById(R.id.buttondisplay);	
		listviewname = (ListView) findViewById(R.id.listView1);
		updatebutton = (Button) findViewById(R.id.buttonupdate);
		updateidedittext  = (EditText) findViewById(R.id.editTextupdate);
	}
	
	public void addData(View v)
	{
		String inputdata =  inputeditext.getText().toString();
		dbo.insertdata(inputdata,dbo);
	}
	
	
	
	public void displayData(View v) 
	{
		Cursor cursor = dbo.retriveinfo(dbo);
		
		if(cursor!=null)
		{
			if(cursor.moveToFirst())
			{
				do
				{
					String name = cursor.getString(0);
					namelist.add(name);
					
				}while(cursor.moveToNext());
			}
		
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,namelist);
			listviewname.setAdapter(adapter);
		}
	}
	
	public void updatedata(View v)
	{
		String pid =  updateidedittext.getText().toString();
		String inputdata= inputeditext.getText().toString();
		dbo.updateproduct(dbo,Integer.parseInt(pid), inputdata);
	}

	public void deletedata(View v) 
	{
		String pid = updateidedittext.getText().toString();
		dbo.deleteproduct(dbo,Integer.parseInt(pid));
	}
	
	

}
