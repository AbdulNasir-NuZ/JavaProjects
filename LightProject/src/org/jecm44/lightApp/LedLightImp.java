package org.jecm44.lightApp;
public class LedLightImp implements ISwitch{

	@Override
	public void sOff() {
	System.out.println("LedLight is OFF!!");
		
	}

	@Override
	public void sOn() {
	System.out.println("LedLight is ON!!");
	}
}
