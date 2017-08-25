package com.example.home;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	TextView t1,t2,t3;
	EditText e1,e2,e3;
	Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.textView1);
        t2=(TextView) findViewById(R.id.textView2);
        t3=(TextView) findViewById(R.id.textView3);
        e1=(EditText) findViewById(R.id.editText1);
        e2=(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        
        
    }
    public void Reset(View v)
    {
    	e1.setText(" ");
    	e2.setText(" ");
    	e3.setText(" ");
    	Toast.makeText(getApplicationContext(),"Your Credentials are cleared",Toast.LENGTH_LONG).show();
    }

    public void Next(View v) 
    {
    	Intent i=new Intent();
    	i.setComponent(new ComponentName(getApplicationContext(),Next.class));
    	startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
