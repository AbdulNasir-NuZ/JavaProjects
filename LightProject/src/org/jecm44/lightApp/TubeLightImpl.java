package org.jecm44.lightApp;
public class TubeLightImpl implements ISwitch
{

	@Override
	public void sOff() {
	System.out.println("TubeLight is OFF!!");
		
	}

	@Override
	public void sOn() {
	System.out.println("TubeLight is ON!!");
	}

}
