package com.example.checkandradio;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {
	CheckBox c1,c2,c3,c4;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox) findViewById(R.id.checkBox1);
        c2=(CheckBox) findViewById(R.id.checkBox2);
        c3=(CheckBox) findViewById(R.id.checkBox3);
        c4=(CheckBox) findViewById(R.id.checkBox4);
    }
    public void Checkbox(View v){
    	if(c1.isChecked())
    	{
    		Toast.makeText(getApplicationContext(), "AI",Toast.LENGTH_SHORT).show();
    	}
    	else if(c2.isChecked())
    	{
    		Toast.makeText(getApplicationContext(), "Network Security",Toast.LENGTH_SHORT).show();
    	}
    	else if(c3.isChecked())
    	{
    		Toast.makeText(getApplicationContext(), "Big Data Analytics",Toast.LENGTH_SHORT).show();
    	}
    	else if(c4.isChecked())
    	{
    		Toast.makeText(getApplicationContext(), "Cloud Computing",Toast.LENGTH_SHORT).show();
    	}
    	else 
    	{
    		Toast.makeText(getApplicationContext(), "Select a item",Toast.LENGTH_SHORT).show();
    	}
    	
   
    }

    public void Next(View v){
    	Intent i=new Intent();
    	i.setComponent(new ComponentName(getApplicationContext(),Second.class));
    	startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
