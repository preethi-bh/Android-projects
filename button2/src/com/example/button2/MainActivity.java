package com.example.button2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView t1,t2;
	EditText e1,e2,e3;
	Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.textView1);
        t2=(TextView) findViewById(R.id.textView2);
        e1=(EditText) findViewById(R.id.editText1);
        e2=(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);
        b1=(Button) findViewById(R.id.button1);
        
        b1.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		String s1=e1.getText().toString();
        		String s2=e2.getText().toString();
        		int i=Integer.parseInt(s2);
        		if(i <18)
        		{
        			e3.setText("YOU ARE NOT AUTHORISED");
        			
        		}
        		else
        			e3.setText("hello "+s1+" welcome!");
        		
        	}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
