package com.example.activitylifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	TextView indicatortextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        indicatortextview =(TextView) findViewById(R.id.textViewindicator);
        Toast.makeText(MainActivity.this,"Inside Oncreate()",Toast.LENGTH_SHORT).show();
        
        indicatortextview.setText("Inside Oncreate()");
        
    
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
        Toast.makeText(MainActivity.this,"Inside Onstart()",Toast.LENGTH_SHORT).show();
        indicatortextview.setText("Inside Onstart()");

    }

    @Override
    protected void onResume() {
    	super.onResume();
        Toast.makeText(MainActivity.this,"Inside OnResume()",Toast.LENGTH_SHORT).show();
        indicatortextview.setText("Inside OnResume()");

    }
    
    @Override
    protected void onPause() {
    	super.onPause();
        Toast.makeText(MainActivity.this,"Inside OnPause()",Toast.LENGTH_SHORT).show();
        indicatortextview.setText("Inside OnPause()");

    }
    
    @Override
    protected void onStop() {
    	super.onStop();
        Toast.makeText(MainActivity.this,"Inside OnStop()",Toast.LENGTH_SHORT).show();
        indicatortextview.setText("Inside OnStop()");

    }
    
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
        Toast.makeText(MainActivity.this,"Inside OnDestroy()",Toast.LENGTH_SHORT).show();
        indicatortextview.setText("Inside OnDestroy()");

    }

    @Override
    protected void onRestart() {
    	super.onRestart();
    	 Toast.makeText(MainActivity.this,"Inside OnRestart()",Toast.LENGTH_SHORT).show();
         indicatortextview.setText("Inside OnRestart()");


    }
    
}
