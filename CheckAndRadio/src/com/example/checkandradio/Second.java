package com.example.checkandradio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Second extends Activity {
	RadioButton r1,r2,r3,r4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		r1=(RadioButton) findViewById(R.id.radio0);
		r2=(RadioButton) findViewById(R.id.radio1);
		r3=(RadioButton) findViewById(R.id.radio2);
		r4=(RadioButton) findViewById(R.id.radio3);
	}
	public void Radio(View v)
	{
		if(r1.isChecked())
    	{
    		Toast.makeText(getApplicationContext(), "Excellent",Toast.LENGTH_SHORT).show();
    	}
		else if(r2.isChecked())
    	{
    		Toast.makeText(getApplicationContext(), "Moderate",Toast.LENGTH_SHORT).show();
    	}
		else if(r3.isChecked())
    	{
    		Toast.makeText(getApplicationContext(), "Needs Improvement",Toast.LENGTH_SHORT).show();
    	}
		else if(r4.isChecked())
    	{
    		Toast.makeText(getApplicationContext(), "Misguiding",Toast.LENGTH_SHORT).show();
    	}
		
	}
    public void Submit(View v)
    {
    	
    		Toast.makeText(getApplicationContext(), "Thanks for your feedback",Toast.LENGTH_SHORT).show();
    	
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}

}
