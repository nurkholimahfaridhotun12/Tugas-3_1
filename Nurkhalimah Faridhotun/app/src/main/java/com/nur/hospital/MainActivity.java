package com.nur.hospital;

import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;

public class MainActivity extends AppCompatActivity 
{
    @Override
    protected void onCreate(Bundle icicle)
    {
        super.onCreate(icicle);
        setContentView(R.layout.main);
    }
	
	public void list(View v){
		Intent i = new Intent(this, RS.class);
		startActivity(i);
	}
}
