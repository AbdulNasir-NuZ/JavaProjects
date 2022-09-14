package org.jecm44.ChocolateApp;
public class ChocolateFactory 
{
public static IMenu getChocolate(String type)
{
	if(type.equalsIgnoreCase("DarkChocolate"))
    {
		return new DarkChocolateImpl();
    }
	else if (type.equalsIgnoreCase("whiteChocolate"))
	{
		return new WhiteChocolateImpl();
		
	}
	else 
	{
		System.out.println("NO CHOCOLATE AVALIABLE !!");
	}
	return null;
}
}
