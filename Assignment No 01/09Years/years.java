/*
Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
Now convert the entered days into complete years, months and days and print them.
*/

import java.util.*;

class Years{

	public static void main(String args[]){

		Scanner scanner= new  Scanner(System.in);
		System.out.println("Enter number of Days");
		int numberOfDays = scanner.nextInt();
	
		int year = numberOfDays/365;
		numberOfDays%=365;
		
		int months=numberOfDays/30;
		numberOfDays%=30;

		int days=numberOfDays;

		System.out.println(year+ " Years "+months+ " Months "+days+ " Days");
		
		}
	}
		
		
		