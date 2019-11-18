package com.example.uts01;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class FMenu extends Fragment {
	
	@Override
    public View onCreateView(LayoutInflater inflater,
    		ViewGroup container,Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fmenu, container, false);
        	
        return rootView;
    }

}
