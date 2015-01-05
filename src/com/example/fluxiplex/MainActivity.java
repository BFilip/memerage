package com.example.fluxiplex;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
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
	SoundPool spma;
	int spma1 = 0;
	int spma2 = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSub);
        display = (TextView) findViewById(R.id.tvDisplay);
        rageImg = (ImageView) findViewById(R.id.rageImg);

        spma = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        spma1 = spma.load(this, R.raw.csb1_wav, 1);
	spma2 = spma.load(this, R.raw.csb2_wav, 1);
        
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter++;
				display.setText("Your rage level is " + counter);
				spma.play(spma1, 1, 1, 0, 0, 1);

				if(counter==21){
					rageImg.setImageResource(R.drawable.r2);
				}else if(counter==41){
					rageImg.setImageResource(R.drawable.r3);
				}else if(counter==61){
					rageImg.setImageResource(R.drawable.r4);
				}

				
			}
		});
        
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter--;
				display.setText("Your rage level is " + counter);
				spma.play(spma2, 1, 1, 0, 0, 1);
				
				if(counter==19){
					rageImg.setImageResource(R.drawable.r1);
				}else if(counter==39){
					rageImg.setImageResource(R.drawable.r2);
				}else if(counter==59){
					rageImg.setImageResource(R.drawable.r3);
				}
				
			}
		});
        
    }

    @Override
    protected void onStop() {
	// TODO Auto-generated method stub
	super.onStop();
	
	spma.release();
	finish();
    }
    
}
