package com.example.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Second extends Activity {
	EditText e1,e2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		e1=(EditText) findViewById(R.id.editText1);
		e2=(EditText) findViewById(R.id.editText2);
		Bundle b=getIntent().getExtras();
		String s=(String) b.get("id1");
		e1.setText("Hello "+s+"!");
		String s2=(String) b.get("id2");
		e2.setText("Your phone no is "+s2);
	}
	public void Prev(View v)
	{
		Intent i=new Intent();
		i.setComponent(new ComponentName(getApplicationContext(),MainActivity.class));
		startActivity(i);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}

}
