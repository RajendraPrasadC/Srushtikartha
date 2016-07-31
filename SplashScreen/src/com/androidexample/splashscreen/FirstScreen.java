package com.androidexample.splashscreen;

import android.app.Activity;
import android.os.Bundle;

public class FirstScreen extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.firstscreen); 
		
	} 
	
	@Override
    protected void onDestroy() {
		
        super.onDestroy();
        
    }
}
