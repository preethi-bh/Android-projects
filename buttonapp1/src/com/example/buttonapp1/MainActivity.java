package com.example.buttonapp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity 
{

	TextView tv1,tv2;
    EditText et1,et2,et3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView) findViewById(R.id.textView1);
        tv2=(TextView) findViewById(R.id.textView2);
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        et3=(EditText) findViewById(R.id.editText3);
        b1=(Button)findViewById(R.id.button1);
        /*
        b1.setOnClickListener(new OnClickListener() 
        {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
			
				String s1=(String)et1.getText().toString();
				String s2=et2.getText().toString();
				et3.setText(s1+" "+s2);
			}
		});*/
        
        
        
        
    }
    public void displayfullname(View v)
    {
    	String s1=(String)et1.getText().toString();
		String s2=et2.getText().toString();
		et3.setText(s1+" "+s2);
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
