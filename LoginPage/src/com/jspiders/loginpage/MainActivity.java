package com.jspiders.loginpage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * 
 * @author user
 *
 */
public class MainActivity extends Activity {

    EditText usernameedittext,passwordeditetxt;
    Button loginbutton,cancelbutton;
    
    String stUsername = "jspiders"; 
    String stPassword = "1234";
    int counter=1;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        usernameedittext = (EditText) findViewById(R.id.editTextusername);
        passwordeditetxt = (EditText) findViewById(R.id.editTextpassword);
        
        loginbutton = (Button) findViewById(R.id.buttonlogin);
        cancelbutton = (Button) findViewById(R.id.buttoncancel);
        
        loginbutton.setOnClickListener(new OnClickListener() {
			
			/**
			 *@author madhu
			 *desc hkjlkl
			 */
     
        	@Override
			public void onClick(View arg0) 
			{
				String entUsername = usernameedittext.getText().toString();
				String entPassword = passwordeditetxt.getText().toString();
				
				
				if(entUsername.equalsIgnoreCase(stUsername)&& entPassword.equals(stPassword))
				{
				
					//This is used to display toast message
					Toast.makeText(MainActivity.this,"Login Successfull....",Toast.LENGTH_SHORT);
				
				}
				
				else
				{
					if(counter!=3)
					{
					Toast.makeText(MainActivity.this,"Login failed",Toast.LENGTH_SHORT).show();
				    counter++;
					}
					else
					{
						
					}
				}
				
			}
		});
        
        
        
        
        
        
        
        
        
        
        
        
    }


  
    
}
