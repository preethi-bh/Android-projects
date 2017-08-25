package com.example.sms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText e1,e2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editText1);
        e2=(EditText) findViewById(R.id.editText2);
        
    }
    public void Send(View v)
    {
    	String s=e1.getText().toString();
    	String s2=e2.getText().toString();
    	
    	//To send SMS using Core Balance
    	Intent i=new Intent(getApplicationContext(),MainActivity.class);
    	PendingIntent p=PendingIntent.getActivity(getApplicationContext(), 0,i,0);
    	SmsManager sms=SmsManager.getDefault();
    	sms.sendTextMessage(s,null,s2,p,null);
    	    	
    }
    public void Send2(View v)throws IOException,UnsupportedEncodingException
    {
    	HttpURLConnection connection=null;
    	BufferedReader in=null;
    	String response ="";
    	String responseContent="";
    	String url="http://www.siegsms.com/SendingSms.aspx";
    	String charset="UTF-8";
    	String userid="deepu555";
    	String pass="deepu555@123";
    	String phone=e1.getText().toString();
    	String msg=e2.getText().toString();
    	String title="TDLGNT";
    	try{
    	String query=String.format("userid=%s&pass=%s&phone=%s&msg=%s&title=%s",
    				URLEncoder.encode(userid, charset),
    				URLEncoder.encode(pass, charset),
    				URLEncoder.encode(phone, charset),
    				URLEncoder.encode(msg, charset),
    				URLEncoder.encode(title, charset));
    	connection=(HttpURLConnection) new URL(url + "?" + query).openConnection();
    	
    	connection.setRequestMethod("GET");
    	

    	connection.connect();
    	
    	Toast.makeText(getApplicationContext(), "after connect ",Toast.LENGTH_SHORT).show();
    	in = new BufferedReader(new InputStreamReader (connection.getInputStream()));
    	while((responseContent = in.readLine()) != null)
    	{
    	response += responseContent;
    	}
    	}
    	catch(MalformedURLException ml)
    	{
    		Toast.makeText(getApplicationContext(), "Message sent due to mal formed successfully",Toast.LENGTH_SHORT).show();
    	}
    	catch(Exception e)
    	{
    		Toast.makeText(getApplicationContext(), "Message Not sent successfully",Toast.LENGTH_SHORT).show();
    	}
    	if(response.equalsIgnoreCase("#500"))
    	{
    	Toast.makeText(getApplicationContext(), "Message sent successfully",Toast.LENGTH_SHORT).show();
    	}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
    
}
