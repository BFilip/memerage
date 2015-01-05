package com.example.fluxiplex;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{

	String classes[] = { "MainActivity", "Splash", "TextPlay", "NextApp", "Email", "Sounds" };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String ser = classes[position];
		try{
			Class jedenClass = Class.forName("com.example.fluxiplex." + ser);
			Intent jedenIntent = new Intent(Menu.this, jedenClass);
			startActivity(jedenIntent);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}


	//options menu u dolu
	@Override
        public boolean onCreateOptionsMenu(android.view.Menu menu) {
	    // TODO Auto-generated method stub
	    super.onCreateOptionsMenu(menu);
	    MenuInflater blowUp = getMenuInflater();
	    blowUp.inflate(R.menu.cool_menu, menu);
	    return true;
        }

	@Override
        public boolean onOptionsItemSelected(MenuItem item) {
	    // TODO Auto-generated method stub
	    //return super.onOptionsItemSelected(item);
	    switch(item.getItemId()){
	    case R.id.opcja1:
                try {
                    Class Copcja1 = Class.forName("com.example.fluxiplex.Opcja1");
	            Intent i = new Intent(Menu.this, Copcja1);
	            startActivity(i);
                } catch (ClassNotFoundException e) {
	            e.printStackTrace();
                }
		break;
		
	    case R.id.preferencje:
                try {
                    Class OPrefs = Class.forName("com.example.fluxiplex.Prefs");
	            Intent p = new Intent(Menu.this, OPrefs);
	            startActivity(p);
                } catch (ClassNotFoundException e) {
	            e.printStackTrace();
                }		
		break;
		
	    case R.id.exit:
                finish();
		break;
	    }
	    return false;
        }


	
}
