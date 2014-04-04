package com.villanuevand.comunicacion.interfragments;

import com.villanuevand.fragments.FragmentB;
import com.villanuevand.interfase.Communicator;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity implements Communicator{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
	}

	@Override
	public void respond(String data) {
		FragmentManager manager = getSupportFragmentManager();		
		FragmentB fragmentB = (FragmentB) manager.findFragmentById(R.id.fragmentB);
		fragmentB.cambiarTexto(data);
		
	}

	

}
