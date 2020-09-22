/*
Create a class Person with properties (name and age) with following features. 
a.Default age of person should be 18.
b.A person object can be initialized with name and age.
c.Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
*/


import java.util.*;
class Person{
	
	private String name;
	private int age=18;

	Person(String name, int age){
		
		this.name = name;
		this.age = age;
	
	}

	public void display(){
	
		System.out.println("Name: "+name+"Age: \n"+age);
	
	}
	
}


class PersonDemo{

	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a name");
	String name = scanner.nextLine();
	System.out.println("Enter a name");
	int age = scanner.nextInt();
	Person p = new Person(name,age);
	p.display();
	
	
	}

}