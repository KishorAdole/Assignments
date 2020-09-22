/*
Create a class Student with 2 data members rno and name. 
Create one method setData() that takes roll number and student name 
as parameter and stores them in data members rno and name. 
Create one more method showData() to print the data member values. 
Create another class ( main class) StudentDemo that 
creates Student class object and calls setData() and showData() methods.
*/


class Student{

	private int rno;
	private String name;

	void setData(int rollNumber, String studentName ){
		
		rno = rollNumber;
		name = studentName;

		}
	void show(){
		
		System.out.println(rno+" "+name);

		}

}


class Main{

	public static void main(String[] args){

		Student S1=new Student();
		Student S2=new Student();

		S1.setData(01,"Tushar");
		S2.setData(02,"Kishor");

		S1.show();
		S2.show();
		S1.setData(03,"Rahul");
		S1.show();
		}

}
		
		