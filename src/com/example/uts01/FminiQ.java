package com.example.uts01;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FminiQ extends Fragment {
	
	TextView tvminq1, tvminq2, tvminq3;
	Button btnminq1, btnminq2, btnminq3;
	EditText etminq1, etminq2, etminq3;
	
	
	public View onCreateView(LayoutInflater inflater,
    		ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fminiq, container, false);
        
        //btnminq1 = (Button)v.findViewById(R.id.btnminq1);
        //etminq1 = (EditText)v.findViewById(R.id.etminq1);
        //String strValue = etminq1.getText().toString();
        //btnminq1.setOnClickListener(new OnClickListener(){
        	
        //public void onClick(View arg0) {
       // if(etminq1="Ya"){
        //	Toast.makeText(getApplicationContext(), "Kamu Benar", Toast.LENGTH_LONG).show();}
        //else if(etminq1="ya"){
        	//Toast.makeText(getApplicationContext(), "Kamu Benar", Toast.LENGTH_LONG).show();}
       // else if(etminq1="YA"){
        //	Toast.makeText(getApplicationContext(), "Kamu Benar", Toast.LENGTH_LONG).show();}
        //else if(etminq1="Tidak"){
        	//Toast.makeText(getApplicationContext(), "Kamu Salah", Toast.LENGTH_LONG).show();}	
        //else if(etminq1="tidak"){
        	//Toast.makeText(getApplicationContext(), "Kamu Salah", Toast.LENGTH_LONG).show();}
        //else if(etminq1="TIDAK"){
        	//Toast.makeText(getApplicationContext(), "Kamu Salah", Toast.LENGTH_LONG).show();}
       // else{Toast.makeText(getApplicationContext(), "Masukkan jawaban antara (Ya) atau (Tidak) saja", Toast.LENGTH_LONG).show();}
        //}});}
        
        //public void onClick(View arg0) {
        //btnminq2 = (Button)v.findViewById(R.id.btnminq2);
        //etminq2 = (EditText)v.findViewById(R.id.etminq2);
        //String strValue = etminq1.getText().toString();
        //btnminq2.setOnClickListener(new OnClickListener());{
        //if(etminq2="Ya"){
        	//Toast.makeText(getApplicationContext(), "Kamu Salah", Toast.LENGTH_LONG).show();}
        //else if(etminq2="ya"){
        	//Toast.makeText(getApplicationContext(), "Kamu Salah", Toast.LENGTH_LONG).show();}
        //else if(etminq2="YA"){
        	//Toast.makeText(getApplicationContext(), "Kamu Salah", Toast.LENGTH_LONG).show();}
        //else if(etminq2="Tidak"){
        	//Toast.makeText(getApplicationContext(), "Kamu Benar", Toast.LENGTH_LONG).show();}	
        //else if(etminq2="tidak"){
        	//Toast.makeText(getApplicationContext(), "Kamu Benar", Toast.LENGTH_LONG).show();}
        //else if(etminq2="TIDAK"){
        	//Toast.makeText(getApplicationContext(), "Kamu Salah", Toast.LENGTH_LONG).show();}
        //else{Toast.makeText(getApplicationContext(), "Masukkan jawaban antara (Ya) atau (Tidak) saja", Toast.LENGTH_LONG).show();}
        //}});
        
        //public void onClick(View arg0) {
        //btnminq3 = (Button)v.findViewById(R.id.btnminq3);
        //etminq3 = (EditText)v.findViewById(R.id.etminq3);
        //String strValue = etminq1.getText().toString();
        //btnminq3.setOnClickListener(new OnClickListener(){
        //if(etminq3="Ya"){
        //	Toast.makeText(getApplicationContext(), "Kamu Benar", Toast.LENGTH_LONG).show();}
        //else if(etminq3="ya"){
        //	Toast.makeText(getApplicationContext(), "Kamu Benar", Toast.LENGTH_LONG).show();}
       // else if(etminq3="YA"){
       // 	Toast.makeText(getApplicationContext(), "Kamu Benar", Toast.LENGTH_LONG).show();}
        //else if(etminq3="Tidak"){
        //	Toast.makeText(getApplicationContext(), "Kamu Salah", Toast.LENGTH_LONG).show();}	
        //else if(etminq3="tidak"){
        	//Toast.makeText(getApplicationContext(), "Kamu Salah", Toast.LENGTH_LONG).show();}
        //else if(etminq3="TIDAK"){
        //	Toast.makeText(getApplicationContext(), "Kamu Salah", Toast.LENGTH_LONG).show();}
        //else{Toast.makeText(getApplicationContext(), "Masukkan jawaban antara (Ya) atau (Tidak) saja", Toast.LENGTH_LONG).show();}
        
        	return rootView;

	}
}