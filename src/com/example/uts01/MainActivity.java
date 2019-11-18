package com.example.uts01;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

	public class MainActivity extends Activity {

    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
	private String mTitle = "";
	 
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	 
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	 
	        mTitle = "Menu";
	        getActionBar().setTitle(mTitle);
	 
	        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
	 
	        mDrawerList = (ListView) findViewById(R.id.drawer_list);
	 
	        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
	                R.drawable.ic_drawer, R.string.drawer_open,
	                R.string.drawer_close) {

	        	public void onDrawerClosed(View view) {
	                getActionBar().setTitle(mTitle);
	                invalidateOptionsMenu();}
	 
	            public void onDrawerOpened(View drawerView) {
	                getActionBar().setTitle("Menu");
	                invalidateOptionsMenu();}
	 
	        };
	 
	        mDrawerLayout.setDrawerListener(mDrawerToggle);
	 
	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(),
	                R.layout.drawer_list_item, getResources().getStringArray(R.array.menus));
	 
	        mDrawerList.setAdapter(adapter);
	 
	        getActionBar().setHomeButtonEnabled(true);
	 
	        getActionBar().setDisplayHomeAsUpEnabled(true);
	 
	        mDrawerList.setOnItemClickListener(new OnItemClickListener() {
	 
	            @Override
	            public void onItemClick(AdapterView<?> parent, View view,
	                    int position, long id) {
	 
	                String[] menuItems = getResources().getStringArray(R.array.menus);

	                mTitle = menuItems[position];
	                if (mTitle.equals("Profil")){
	                	FProfil fragmenthome = new FProfil();
	                	
	                    FragmentManager fragmentManager = getFragmentManager();
	 
	                    FragmentTransaction ft = fragmentManager.beginTransaction();
	 
	                    ft.replace(R.id.content_frame, fragmenthome);
	 
	                    ft.commit();
	                }
	                else if (mTitle.equals("Mini Question")){
	                    FminiQ fragmentpage1 = new FminiQ();
	                    FragmentManager fragmentManager = getFragmentManager();
	 
	                    FragmentTransaction ft = fragmentManager.beginTransaction();
	 
	                    ft.replace(R.id.content_frame, fragmentpage1);
	 
	                    ft.commit();
	                }
	            	else if (mTitle.equals("Math Question")){
	                    Fmatcq fragmentpage2 = new Fmatcq();
	                    FragmentManager fragmentManager = getFragmentManager();

	                    FragmentTransaction ft = fragmentManager.beginTransaction();
	 
	                    ft.replace(R.id.content_frame, fragmentpage2);
	 
	                    ft.commit();
	                }
	            	else if (mTitle.equals("Exit")){
	            		finish();
	            	}
	 
	                mDrawerLayout.closeDrawer(mDrawerList);
	 
	            }
	        });
	        
	        FMenu fragmenthome = new FMenu();
            FragmentManager fragmentManager = getFragmentManager();

            FragmentTransaction ft = fragmentManager.beginTransaction();

            ft.replace(R.id.content_frame, fragmenthome);

            ft.commit();
            
	    }
	 
	    @Override
	    protected void onPostCreate(Bundle savedInstanceState) {
	        super.onPostCreate(savedInstanceState);
	        mDrawerToggle.syncState();
	    }
	 
	    @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	        if (mDrawerToggle.onOptionsItemSelected(item)) {
	            return true;
	        }
	        return super.onOptionsItemSelected(item);
	    }
	 
	    @Override
	    public boolean onPrepareOptionsMenu(Menu menu) {
	       
	    	boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
	 
	        menu.findItem(R.id.menu_settings).setVisible(!drawerOpen);
	        return super.onPrepareOptionsMenu(menu);
	    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}}
	 
	