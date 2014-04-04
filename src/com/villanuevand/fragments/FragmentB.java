package com.villanuevand.fragments;

import com.villanuevand.comunicacion.interfragments.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {

	TextView textview;
	String data;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_b, container, false);
		if(savedInstanceState != null){
			data = savedInstanceState.getString("mensaje");
			TextView txt = (TextView) view.findViewById(R.id.textview_fragment_b);
			txt.setText(data);
		}else{
			TextView txt = (TextView) view.findViewById(R.id.textview_fragment_b);
			txt.setText(getResources().getString(R.string.app_name));
		}
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {		
		super.onActivityCreated(savedInstanceState);
		textview = (TextView) getActivity().findViewById(R.id.textview_fragment_b);
	}
	
	public void cambiarTexto(String data) {
		this.data = data;
		textview.setText(data);
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {	
		super.onSaveInstanceState(outState);
		outState.putString("mensaje", data);
	}
	
}
