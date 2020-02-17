package com.mode.Adapter.MAIN1;

public class Adapter extends Usber implements Ps2{
    
	  private Usb usb;
	    public Adapter(Usb usb){
	        this.usb = usb;
	    }

	    public void isPs2() {
	        usb.isUsb();
	    }

}