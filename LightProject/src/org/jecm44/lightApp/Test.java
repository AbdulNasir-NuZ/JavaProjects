package org.jecm44.lightApp;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Switch type");
		String type =sc.next();
		sc.close();
		ISwitch sw= LightFactory.getLight(type);
		if(sw!=null)
		{
			sw.sOn();
			sw.sOff();
		}
		
	}

}
