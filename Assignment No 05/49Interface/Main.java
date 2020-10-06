/*Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. 
create abstract method calcTax(). 
a.Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary. 
b.Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product. 
c.Create class for main method(Say XYZ), accept employee information and a product information from user and 
print income tax and sales tax respectively.
*/

package com.oops;

import java.util.Scanner;

interface Taxable{
	float salesTax=7F;
	float incomeTax=10.5F;
	
	void calcTax();
}

class Employee implements Taxable{
	
	private int empId;
	private String name;
	private int salary;
	private float totalIncomeTax=0;
	
	Employee(int empId, String name, int salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	public void calcTax() {
		totalIncomeTax=((salary*12)*incomeTax)/100;
		System.out.println("Employee Id: "+empId+"\nName of the Employee: "+name+"\nIncomeTax on yearly salary: "+totalIncomeTax);
	}
	
}

class Product implements Taxable{
	
	private int pid;
	private int price;
	private int quantity;
	private float totalSalesTax=0;
	
	Product(int pid, int price, int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	public void calcTax() {
	
		totalSalesTax=(price*salesTax)/100;
		
		System.out.println("Product Id: "+pid+"\nSales Tax on unit price of product: "+totalSalesTax+
								"\nSales Tax on total quantity: "+(totalSalesTax*quantity));
		
	}
}


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Employee Id: ");
		int empId=scanner.nextInt();
		scanner.nextLine();
		System.out.print("\nEnter Empolyee Name: ");
		String name=scanner.nextLine();
		System.out.print("\nEnter Salary: ");
		int salary=scanner.nextInt();
		System.out.println("----------------------------");
		System.out.print("Enter Product id: ");
		int pid=scanner.nextInt();
		System.out.println("\nEnter Product Price: ");
		int price=scanner.nextInt();
		System.out.println("\nEnter quantity: ");
		int quantity=scanner.nextInt();
		
		Taxable[] T= {new Employee(empId,name,salary),new Product(pid,price,quantity) };
		
			for(Taxable a: T) {
			a.calcTax();
			}
	}

}
