/*
Write a program to find the simple interest. 
Take the principle amount, rate of interest and time from user using Scanner class.
*/

import java.util.*;

class SimpleInterest{

	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Principle amount");
		int principle = scanner.nextInt();

		System.out.println("Enter rate of interest");
		float rateOfInterest = scanner.nextFloat();

		System.out.println("Enter time");
		int time = scanner.nextInt();

		double simpleInterest=(principle*rateOfInterest*time)/100;
		System.out.println("Simple interest = "+simpleInterest);

		}
}