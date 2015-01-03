package com.example.fluxiplex;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	int counter;
	Button add;
	Button sub;
	TextView display;
	ImageView rageImg;
	MediaPlayer mp;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSub);
        display = (TextView) findViewById(R.id.tvDisplay);
        rageImg = (ImageView) findViewById(R.id.rageImg);
        mp = MediaPlayer.create(this, R.raw.clicksound);
        
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter++;
				display.setText("Your rage level is " + counter);

				if(counter==21){
					rageImg.setImageResource(R.drawable.r2);
					mp.start();
				}else if(counter==41){
					rageImg.setImageResource(R.drawable.r3);
					mp.start();
				}else if(counter==61){
					rageImg.setImageResource(R.drawable.r4);
					mp.start();
				}

				
			}
		});
        
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter--;
				display.setText("Your rage level is " + counter);
			
				if(counter==19){
					rageImg.setImageResource(R.drawable.r1);
					mp.start();
				}else if(counter==39){
					rageImg.setImageResource(R.drawable.r2);
					mp.start();
				}else if(counter==59){
					rageImg.setImageResource(R.drawable.r3);
					mp.start();
				}
				
			}
		});
        
    }
}
