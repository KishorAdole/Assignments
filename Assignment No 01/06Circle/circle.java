/*
Write a program that takes radius of a circle as input. 
Read the entered radius using Scanner class. 
Then calculate and print the area and circumference of the circle
*/


import java.util.*;

class Circle{

	public static void main(String args[]){

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a Radius ");
	int radius = scanner.nextInt();
	double pi = 3.14; 
	double Area = pi*radius*radius;
	
	double Circumference = 2*pi*radius;

	System.out.println("Area of circle is "+Area);
	System.out.println("Circumference of circle is "+Circumference);

	}
}