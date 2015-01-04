package com.example.fluxiplex;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Sounds extends Activity implements OnClickListener{
    
    Button s1;
    Button s2;
    Button s3;
    Button s4;
    TextView tvs1;
    SoundPool sp;
    int p1 = 0;
    int p2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.sounds);
	
	s1 = (Button) findViewById(R.id.bS1);	s1.setOnClickListener(this);
	s2 = (Button) findViewById(R.id.bS2);	s2.setOnClickListener(this);
	s3 = (Button) findViewById(R.id.bS3);	s3.setOnClickListener(this);
	s4 = (Button) findViewById(R.id.bS4);	s4.setOnClickListener(this);	
	tvs1 = (TextView) findViewById(R.id.tvS1);	tvs1.setOnClickListener(this);
	sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
	p1 = sp.load(this, R.raw.clicksound, 1);
	p2 = sp.load(this, R.raw.cs, 1);
	//mps = MediaPlayer.create(this, R.raw.cs);
    }

    @Override
    public void onClick(View lol) {
	// TODO Auto-generated method stub
	if(lol.getId() == R.id.bS1){
	    tvs1.setText(">Play Sound 1");
	    sp.play(p1, 1, 1, 0, 0, 1);
	}else if(lol.getId() == R.id.bS2){
	    tvs1.setText(">    Play Sound 2");
	    sp.play(p1, 1, 1, 0, 0, 1);
	}else if(lol.getId() == R.id.bS3){
	    tvs1.setText(">        Play Sound 3");
	    sp.play(p2, 1, 1, 0, 0, 1);
	}else if(lol.getId() == R.id.bS4){
	    tvs1.setText(">            Play Sound 4");
	    sp.play(p2, 1, 1, 0, 0, 1);
	}else{
	    tvs1.setText("Nie ma takiego klikania!");
	}
	
    }

}
