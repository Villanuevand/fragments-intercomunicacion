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
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_b, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {		
		super.onActivityCreated(savedInstanceState);
		textview = (TextView) getActivity().findViewById(R.id.textview_fragment_b);
	}
	
	public void cambiarTexto(String data) {
		textview.setText(data);
	}
	
}
