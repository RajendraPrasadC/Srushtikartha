package com.jsp.radiobuttonsdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener{

   TextView inputmessagetextview;
   RadioButton choice1radiobutton,choice2radiobutton;
   RadioGroup groupoptions;
   CheckBox choice1checkbox;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        inputmessagetextview = (TextView) findViewById(R.id.textViewdisplaychoice);
        choice1radiobutton = (RadioButton) findViewById(R.id.radioButtonchoice1);
        choice2radiobutton = (RadioButton) findViewById(R.id.radioButtonchoice2);
        groupoptions = (RadioGroup) findViewById(R.id.radioGroup1);
        
        choice1checkbox = (CheckBox) findViewById(R.id.checkBoxselection1);
        
        choice1radiobutton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) 
			{
				
				if(state==true)
				{
					Toast.makeText(MainActivity.this,"You selected male",Toast.LENGTH_SHORT).show();
					
				}
			}
		});
        
	}

	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) 
	{
		switch (arg1) 
		{
		case R.id.radiooption1:
			
			Toast.makeText(MainActivity.this,"You selected option1",Toast.LENGTH_SHORT).show();
			break;
			
		case R.id.radiooption2:
			Toast.makeText(MainActivity.this,"You selected option2",Toast.LENGTH_SHORT).show();
            break;
            
		case R.id.radiooption3:
			Toast.makeText(MainActivity.this,"You selected option3",Toast.LENGTH_SHORT).show();
            break;
            
		default:
			break;
		}
		
		
		choice1checkbox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) 
			{
				if(arg1==true)
				{
					Toast.makeText(MainActivity.this,"You selected choice1 checkbox",Toast.LENGTH_SHORT).show();

				}
				
				else
				{
					Toast.makeText(MainActivity.this,"You deselected choice1 checkbox",Toast.LENGTH_SHORT).show();

				}
			}
		});
		
		
		choice1checkbox.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				if(choice1checkbox.isChecked())
				{
					Toast.makeText(MainActivity.this," Checkbox selected",Toast.LENGTH_SHORT).show();
				}
			}
		});
		
		
		
		
		
		
		
		
		
	}


}
