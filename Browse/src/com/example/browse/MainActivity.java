package com.example.browse;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText e;
	Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=(EditText) findViewById(R.id.editText1);
        b=(Button) findViewById(R.id.button1);
        
    }
    public void Browse(View v)
    {
    	String s=e.getText().toString();
    	Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse(s));
    	startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
