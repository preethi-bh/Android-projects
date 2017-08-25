package com.example.spinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener {
	Spinner st;
	EditText et;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        st=(Spinner)findViewById(R.id.spinner1);
        et=(EditText)findViewById(R.id.editText1);
        String cities[]={"Hyderabad","Vijayawada","Calcutta","Mumbai","Gurgaon","Fatimanagar","Ranchi","Delhi","Bangalore","Nagpur"};
        ArrayAdapter<String> aa=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,cities);
        st.setAdapter(aa);
        st.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> av,View v,int pos,long id)
    {
    	String string=av.getItemAtPosition(pos).toString();
    	et.setText(string);	
    	
    }
    @Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(),"Select a item",Toast.LENGTH_SHORT).show();
    			
	}
  
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
	
    
}
