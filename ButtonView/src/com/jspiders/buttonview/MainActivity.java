package com.jspiders.buttonview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

    
	EditText inputedittext;
	Button displaybutton,displayred,displayblue;
	TextView outputtextview;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        inputedittext = (EditText)findViewById(R.id.editTextinput);
        displaybutton = (Button) findViewById(R.id.buttondisplay);
        outputtextview = (TextView) findViewById(R.id.textViewoutput);

        displayred = (Button) findViewById(R.id.buttoncolordispaly);
        displayblue = (Button) findViewById(R.id.buttoncolordisplayblue);
        
        
        displayred.setOnClickListener(MainActivity.this);
        displayblue.setOnClickListener(MainActivity.this);
     
    }
	
	public void displaymessage(View v)
	{
		String inputmessage = inputedittext.getText().toString();
		inputedittext.setText("");
		outputtextview.setText(inputmessage);

	}

	@Override
	public void onClick(View v) 
	{
		
		switch (v.getId()) 
		{
		case R.id.buttoncolordispaly:
			
			Log.d("[DEBUG]","Red button was clicked");
			
			break;
			
		case R.id.buttoncolordisplayblue : 
			Log.d("[DEBUG]","Blue Button was clicked");

		default:
			break;
		}
	}
}
