/*
 Write a program to demonstrate functionalities of this keyword in java
*/


class Student{

	private int rno;
	private String name;

	void setData(int rno, String name ){
		
		this.rno = rno;
		this.name = name;

		}
	void show(){
		
		System.out.println(rno+" "+name);

		}

}


class Main{

	public static void main(String[] args){

		Student S1=new Student();
		S1.setData(01,"Tushar");
		S1.show();

		Student S2=new Student();
		S2.setData(02,"Kishor");		
		S2.show();
		
		}

}
		
		