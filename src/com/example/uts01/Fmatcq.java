package com.example.uts01;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Fmatcq extends Fragment {
	
	ListView lvmath;
	String[] menu = {"Matematika Dasar","Bangun Datar","Baris dan Deret"}; 
	ArrayAdapter<String> adapter;
	
	@Override
    public View onCreateView(LayoutInflater inflater,
    		ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fmathq, container, false);
         
        lvmath = (ListView)rootView.findViewById(R.id.listView);
        lvmath.setAdapter(adapter);
        
        return rootView;

            }
		
	}
