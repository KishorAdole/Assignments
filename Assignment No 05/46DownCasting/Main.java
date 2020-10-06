/*Create a program to demonstrate the use of instanceof operator or secure reference down casting*/

class Parent{

	void m1(){
	System.out.println("Method 1");	
	}

	void m2(){
	System.out.println("Method 2");	
	}

}


class Child extends Parent{

	void m2(){
	System.out.println("Method 3");	
	}

	void m3(){
	System.out.println("Method 4");	
	}

}
public class Main {

	public static void main(String[] args) {
		Parent P= new Child();
		Child C=(Child)P;		//down-casting
		C.m1();
		C.m2();
		C.m3();
		

	}

}
