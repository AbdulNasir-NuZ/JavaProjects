package org.jecm44.ChocolateApp;
import java.util.Scanner;

public class Test1 
{
public static void main(String[] args) 
{
   Scanner sc= new Scanner(System.in);	
   System.out.println("Enter the Type Of Chocolate  ?");  
   String type=sc.next();
     sc.close();
     IMenu im=ChocolateFactory.getChocolate(type);
     if(im!=null)
     {
    	 im.mAvaliable();
    	 im.mNotAvaliable();
     }
     
}
}
