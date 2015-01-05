package com.example.fluxiplex;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Txt extends Activity{
    
    TextView poleTxt;
    String gotTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.txt);
	poleTxt = (TextView) findViewById(R.id.txtPole);
	
	Bundle gotBasket = getIntent().getExtras();
	gotTxt = gotBasket.getString("key");
	poleTxt.setText(gotTxt);
    }

}
