/*
Create a class Circle that has two data members, 
one to store the radius and another to store area and three methods 
first init() method to input radius from user, second calculateArea() method 
to calculate area of circle and third display() method 
to display values of radius and area. Create class CircleDemo ( main class) that 
creates the Circle object and calls init(),calculateArea() and display() methods.
*/

import java.util.*;
class Circle{

	private int radius;
	private double area;
	private static final float pi = 3.14f;
		
	public void init(int radius){
		
		this.radius=radius;
		}
	
	public void calculateArea(){
		
		area = (double)(2*pi*radius*radius);
		}

	public void display(){

		System.out.println("area: "+area);


			}
}


class Main{
	
	public static void main(String[] args){
		Circle c = new Circle();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Radius");
		int radius=scanner.nextInt();
		c.init(radius);
		c.calculateArea();
		c.display();
	}
}