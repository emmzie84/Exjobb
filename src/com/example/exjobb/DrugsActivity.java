package com.example.exjobb;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.Toast;

public class DrugsActivity extends Activity {
	String[] drugs;
	String[] types;
	String[] potency;
	String[] nbr;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.drugs);
		
		drugs = getResources().getStringArray(R.array.drugs_array);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, drugs);
		AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.txtDrugs);		
		textView.setThreshold(3);
		textView.setAdapter(adapter);
		
		types = getResources().getStringArray(R.array.type_array);
		Spinner sp1 = (Spinner) findViewById(R.id.spiType);
		ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, types);
		sp1.setAdapter(adapter2);
		sp1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				int index = arg0.getSelectedItemPosition();
				Toast.makeText(getBaseContext(), "You've selected item: " + types[index], Toast.LENGTH_SHORT).show();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
			}
			
		});
		
		potency = getResources().getStringArray(R.array.potency_array);
		Spinner sp2 = (Spinner) findViewById(R.id.spiPot);
		ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, potency);
		sp2.setAdapter(adapter3);
		sp2.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				int index = arg0.getSelectedItemPosition();
				Toast.makeText(getBaseContext(), "You've selected item: " + potency[index], Toast.LENGTH_SHORT).show();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
			}
			
		});
		
		nbr = getResources().getStringArray(R.array.nbr_array);
		Spinner sp3 = (Spinner) findViewById(R.id.spiNbr);
		ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, nbr);
		sp3.setAdapter(adapter4);
		sp3.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				int index = arg0.getSelectedItemPosition();
				Toast.makeText(getBaseContext(), "You've selected item: " + nbr[index], Toast.LENGTH_SHORT).show();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
			}
			
		});
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.drugs, menu);
		return true;
	}*/

}
