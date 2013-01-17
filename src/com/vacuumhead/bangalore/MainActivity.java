package com.vacuumhead.bangalore;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	final public String mapDataFile = "mapData";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button calculateFareButton = (Button) findViewById(R.id.calculateFareButton);
		Button exitButton = (Button) findViewById(R.id.applicationExitButton);
		Button viewMapButton = (Button) findViewById(R.id.viewMapButton);	
		calculateFareButton.setOnClickListener(mainMenuClickListener);		
		exitButton.setOnClickListener(mainMenuClickListener);
		viewMapButton.setOnClickListener(mainMenuClickListener);
		
	
	}
	
	OnClickListener mainMenuClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(v.getId()){
			
			case R.id.calculateFareButton:
				Intent intent = new Intent(MainActivity.this, CalculateFareActivity.class);
				startActivity(intent);
				break;
			case R.id.viewMapButton:
				Intent intent1 = new Intent(MainActivity.this, ViewMapActivity.class);
				startActivity(intent1);
				break;	
			case R.id.applicationExitButton:
				finish();
				break;
			}			
		}
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}