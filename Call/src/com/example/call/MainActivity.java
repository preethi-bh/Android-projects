package com.example.call;

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
        b=(Button) findViewById(R.id.button1);
        e=(EditText) findViewById(R.id.editText1);
    }
    public void Call(View v)
    {
    	Intent i=new Intent();
    	i.setAction(Intent.ACTION_CALL);
    	Uri.Builder u=new Uri.Builder();
    	u.scheme("tel");
    	u.path(e.getText().toString());
    	i.setData(u.build());
    	startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
