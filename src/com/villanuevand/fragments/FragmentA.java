package com.villanuevand.fragments;

import com.villanuevand.comunicacion.interfragments.R;
import com.villanuevand.interfase.Communicator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentA extends Fragment implements OnClickListener{

	Button button;
	int counter = 0;
	Communicator c;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {	
		super.onCreate(savedInstanceState);
		if(savedInstanceState != null){
			savedInstanceState.getInt("contador",0);
			
		}else{
			counter = 0;
		}
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {		
		return inflater.inflate(R.layout.fragment_a, container, false);		
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {	
		super.onActivityCreated(savedInstanceState);
		c = (Communicator) getActivity();
		button = (Button) getActivity().findViewById(R.id.btn_fragment_a);
		button.setOnClickListener(this);
		
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {	
		super.onSaveInstanceState(outState);
		outState.putInt("contador", counter);
	}
	
	@Override
	public void onClick(View v) {	
		counter++;
		c.respond(getResources().getString(R.string.msj_presionado_x,counter));
	}
	

}
