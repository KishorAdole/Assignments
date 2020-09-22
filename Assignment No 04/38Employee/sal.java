/*
Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.Only parameterized constructor. [Do not overload the constructor]
b.totalSalary always represents salary total of all the employees created.
c.empNo should be auto incremented.
d.display total employees and totalSalary using a method.
  Create another class EmployeeDemo (main class) that creates some Employee objects and 
  calls Employee method to display no. of employees and total of their salaries.
*/


import java.util.*;

class Employee{

		private static int empNo=0;
		private int salary;
		private static int totalSalary;

		Employee(int salary){
		empNo++;
		this.salary=salary;
		totalSalary+=this.salary;

		} 

		public void display(){
		
		System.out.println("No. of employees: "+empNo+"\nsalary total of all the employees: "+totalSalary );	
	
		}
	}

class EmployeeDemo{

		public static void main(String[] args){

		//Scanner scanner = new Scanner(System.in);
		//int salary =  scanner.nextInt();
		Employee e = new Employee(9000);
		//e.display();
		Employee e1 = new Employee(10000);
		//e1.display();
		Employee e2 = new Employee(11000);
		//e2.display();
		Employee e3 = new Employee(12000);
		e3.display();
		}


}