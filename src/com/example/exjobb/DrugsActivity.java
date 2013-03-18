package com.example.exjobb;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class DrugsActivity extends Activity {
	String[] drugs = {"Alvedon", "Alxedon", "Alyedon", "Alzedon", "Alåedon", "Aläedon", "Alöedon"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.drugs);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, drugs);
		
		AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.txtDrugs);
		
		textView.setThreshold(3);
		textView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.drugs, menu);
		return true;
	}

}
