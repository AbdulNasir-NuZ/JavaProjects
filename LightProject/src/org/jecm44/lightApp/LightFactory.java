package org.jecm44.lightApp;
public class LightFactory 
{
public static ISwitch getLight(String type)
{
	if(type.equalsIgnoreCase("TubeLight") )
	{
		return new TubeLightImpl();
	}
	else if(type.equalsIgnoreCase("LedLight"))
	{
		return new LedLightImp();
	}
	else 
	{
		System.out.println("No LIGHT FOUND !!");
	}
 
return null;
}
}