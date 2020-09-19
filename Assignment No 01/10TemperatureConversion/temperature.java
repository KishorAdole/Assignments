/*
Write a program to convert temperature from Fahrenheit to Celsius. 
Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
*/

import java.util.*;
class TemperatureConversion{

	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature in Farenheit");
		double Fahrenheit = scanner.nextDouble();

		double Celsius = (5*(Fahrenheit-32)/9);

		System.out.println("Temperature in Celsius is "+Celsius+" c");
		
		}

	}



		