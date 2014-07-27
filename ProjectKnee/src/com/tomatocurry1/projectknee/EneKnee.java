package com.tomatocurry1.projectknee;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class EneKnee extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ene_knee);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ene_knee, menu);
		return true;
	}

}
