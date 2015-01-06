package com.example.fluxiplex;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.view.View;

public class MyBringBack extends View{

    Bitmap gBall;
    float dY;
    Typeface font;
    
    public MyBringBack(Context context) {
	super(context);
	// TODO Auto-generated constructor stub
	gBall = BitmapFactory.decodeResource(getResources(), R.drawable.ball);
	dY = 0;
	font = Typeface.createFromAsset(context.getAssets(), "font1.TTF");
    }

    @Override
    protected void onDraw(Canvas canvas) {
	// TODO Auto-generated method stub
	super.onDraw(canvas);
	canvas.drawColor(Color.YELLOW);
	
	//tekst w tle
	Paint textPaint = new Paint();
	textPaint.setARGB(50, 254, 20, 160);
	textPaint.setTextAlign(Align.CENTER);
	textPaint.setTextSize(50);
	textPaint.setTypeface(font);
	canvas.drawText("FLUXIPLEX", canvas.getWidth()/2, 200, textPaint);
	
	//ruchoma pilka
	canvas.drawBitmap(gBall, (canvas.getWidth()/2), dY, null);
	if(dY < canvas.getHeight()){
	    dY += 10;
	}else{
	    dY = 0;
	}
	
	//pasek zaslaniajacy pilke
	Rect middleRect = new Rect();
	middleRect.set(0, 400, canvas.getWidth(), 550);
	Paint ourBlue = new Paint();
	ourBlue.setColor(Color.BLUE);
	canvas.drawRect(middleRect, ourBlue);
	
	invalidate();	//zapêtla wszystko w metodzie
    }
    
    
    
    

}
