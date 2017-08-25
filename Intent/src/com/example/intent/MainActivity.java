package com.example.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText) findViewById(R.id.editText1);
        t2=(EditText) findViewById(R.id.editText2);
        
    }
    public void Next(View v)
    {
    	Intent i=new Intent();
    	i.setComponent(new ComponentName(getApplicationContext(),Second.class));
    	i.putExtra("id1",t1.getText().toString());
    	i.putExtra("id2", t2.getText().toString());
    	startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
