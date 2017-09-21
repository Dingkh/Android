package com.farsight.ledapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    private ImageButton button;
    public boolean statu =false;
	private LedService led;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        led = new LedService();
        button = (ImageButton) findViewById(R.id.imageButton1);
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				statu = !statu;
				if(statu){
					led.led_open();
					led.led_ioctl(1, 1);
					button.setImageDrawable(getResources().getDrawable(R.drawable.bulb_on));
					
				}else{
					led.led_ioctl(1, 0);
					led.led_close();
					button.setImageDrawable(getResources().getDrawable(R.drawable.bulb_off));
					
				}
				
			}
		});
        
        
    }



    
}
