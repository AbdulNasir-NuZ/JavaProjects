package org.jecm44.ChocolateApp;
public class WhiteChocolateImpl implements IMenu
{
	@Override
	public void mAvaliable() {
		System.out.println("White Chocolate is Avaliable!!");
		
	}

	@Override
	public void mNotAvaliable() {
		System.out.println("White Chocolate is Not Avaliable!!");
	}

}
