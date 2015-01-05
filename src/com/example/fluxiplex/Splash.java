package com.example.fluxiplex;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class Splash extends Activity{

	MediaPlayer splashSound;
	
	@Override
	protected void onCreate(Bundle Arjusiur) {
		// TODO Auto-generated method stub
		super.onCreate(Arjusiur);
		setContentView(R.layout.splash);
		
		splashSound = MediaPlayer.create(Splash.this, R.raw.cs);
		
		SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		boolean startSound = getPrefs.getBoolean("checkbox", true);
		if(startSound == true)splashSound.start();
		
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(2000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openMain = new Intent("com.example.fluxiplex.MENU");
					startActivity(openMain);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		splashSound.release();
		finish();
	}
	
}
