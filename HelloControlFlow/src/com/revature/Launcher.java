package com.revature;
import java.util.*;
public class Launcher {

	public static void main(String[] args) {
		
		int randomNum = (int)(Math.random() * 100);
		//what are we doing here? Typecasting!
		//just beware when casting from a double to an int, the decimal place will be lost
		//Math.random() typically returns a double, but we'll turn it into an int to make the number integers
		//Note - typecasting rounds DOWN, so the highest number we could get is 99
		
		System.out.println(randomNum); //just to show it works
		
		System.out.println("================================(if/else-if/else)");
		
		if(randomNum > 75) {
			System.out.println("random number is real big!"); //if randomNum > 75, run this code
		} else if (randomNum > 50) {
			System.out.println("random number is schmedium"); //otherwise, if it's greater than 50, run this code
		} else {
			System.out.println("random number is smol..."); //if all else fails, run this code
		}
		
		System.out.println("===============================(while/do-while loops)");
		
		int smallNum = 2;
		
		while(smallNum < 500)
		{
			smallNum += 100;
			
			System.out.println("smallNum has increased to: " + smallNum);
		}
		
		System.out.println("While Loop has completed!");
		
		do
		{
			smallNum -= 100;
			System.out.println("smallNum has decreased to: " + smallNum);
		} while(smallNum > 10);
		
		System.out.println("Do While Loop has completed!");
		
		System.out.println("===============================(For Loops");
		
		int x = 0;
		for(int i = 0; i < 10; i++)
		 {
			 x++;
			 System.out.println("loop victim is now : " + x);
			 System.out.println("iterator is now: " + i);
			 
				switch(x)
				{
				case 1:
					System.out.println("Just getting started!");
					break;
					
				case 5:
					System.out.println("Halfway there!");
					break;
				
				case 10:
					System.out.println("All done!");
					break;
				
				default:
					System.out.println("Nothing to see here...");
					break;
				}
				System.out.println();
		 }
		
		System.out.println("For Loop completed!");
		
		
		char[] myName = {'B', 'E', ' ', 'N', 'A', 'A', 'A'};
		System.out.println(myName);
		
		for(int i = 0; i < myName.length; i++)
		{
			if(myName[i] == ' ' ||  myName[i] == 'A')
			{
				continue;
			}
			else
			{
				System.out.println(myName[i]);
			}
			
		}
		
		
		
		switch(x)
		{
		case 1:
			System.out.println("Just getting started!");
			break;
			
		case 5:
			System.out.println("Halfway there!");
			break;
		
		case 10:
			System.out.println("All done!");
			break;
		
		default:
			System.out.println("Nothing to see here...");
			break;
		}
		
		
	}
	
}
