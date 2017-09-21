package com.farsight.ledapp;

public class LedService {
	static{
		
		System.loadLibrary("native");
	}
	
	public native int led_open();
	public native int led_ioctl(int which,int status);
	public native int led_close();
}
