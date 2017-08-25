package com.example.database;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	SQLiteDatabase sdb;
	EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        e1=(EditText) findViewById(R.id.editText1);
        e2=(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);
        sdb=openOrCreateDatabase("vaishnavi",Context.MODE_PRIVATE,null);
        sdb.execSQL("create table if not exists student(name varchar,rollno number,year number)");
         
    }
    public void Insert(View v)
    {
    	ContentValues cv=new ContentValues();
    	cv.put("name", e1.getText().toString());
    	cv.put("rollno", e2.getText().toString());
    	cv.put("year", e3.getText().toString());
    	sdb.insert("student", null, cv);
    	Toast.makeText(getApplicationContext(), "Inserted",Toast.LENGTH_SHORT).show();
    	e1.setText(" ");
    	e2.setText(" ");
    	e3.setText(" ");
    		
    }
    public void Retrieve(View v)
    {
    	    	
    	Cursor c=sdb.query("student",new String[]{"name","rollno","year"},"rollno=?",new String[]{e2.getText().toString()}, null,null,null);
    	while(c.moveToNext())
    	{
    		Toast.makeText(getApplicationContext(), c.getString(0)+" "+c.getInt(1)+" "+c.getInt(2), 2000).show();
    	}
    }

    public void Retrieve2(View v)
    {
    	Cursor c=sdb.query("student",new String[]{"name","rollno","year"},null,null,null,null,null);
    	while(c.moveToNext())
    	{
    		Toast.makeText(getApplicationContext(), c.getString(0)+" "+c.getInt(1)+" "+c.getInt(2), 2000).show();
    	}
    }
    public void Update(View v)
    {
    	ContentValues cv=new ContentValues();
    	cv.put("name", e1.getText().toString());
    	cv.put("year", e3.getText().toString());
    	int x=sdb.update("student",cv, "rollno=?",new String[]{e2.getText().toString()});
    	if(x>0)
    	{
    		Toast.makeText(getApplicationContext(), "Updated successfully", 2000).show();
    	}
    }
    public void Delete(View v)
    {
    	int x=sdb.delete("student", "rollno=?",new String[]{e2.getText().toString()});
    	if(x>0)
    	{
    		Toast.makeText(getApplicationContext(), "Deleted successfully", 2000).show();
    		
    	}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
