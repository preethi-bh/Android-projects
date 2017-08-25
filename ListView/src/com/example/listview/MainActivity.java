package com.example.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView t1;
        t1=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        
        String[] cities= new String[]{"Hyderabad","Bombay","Bengaluru","Hydernagar","Chennai","Chandigarh","Jharkhand","Jaipur","Kolkata","Kasi"};
        ArrayAdapter<String> aa=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_dropdown_item_1line,cities);
        t1.setThreshold(1);
        t1.setAdapter(aa);
       
        
    }

    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
