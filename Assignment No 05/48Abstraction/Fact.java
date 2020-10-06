import java.util.Scanner;

/*Create an Abstract class Processor with integer member variable data  and
method showData to display data value. Create abstract method process()to define processing of member data. 
Create a class  Factorial using abstract class Processor to calculate and 
print factorial of a number by overriding the process method. 
Create a class Circle using abstract class Processor to calculate and 
print area of a circle by overriding the process method.
Ask user to enter choice (factorial or circle area).  Also ask data to work upon. 
Use Processor class reference to achieve this mechanism.
*/
abstract class Processor{
	int data;
	abstract void process();
	Processor(int data){
		this.data=data;
	}
	void showData() {
		System.out.println("the value of data: "+data);	
	}	
}

class Factorial extends Processor{
	
	private int number;
	private int fact=1;
	
	
	Factorial(int data, int number){
		super(data);
		this.number=number;
	}
	void process() {
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		super.showData();
		System.out.println("Factorial: "+fact);
	}
}

class Circle extends Processor{
	private final float PI=3.14F;
	private int radius;
	private float area;
	
	Circle(int data,int radius){
		super(data);
		this.radius=radius;
	}
	
	void process() {
		area=PI*radius*radius;
		System.out.println("Area of Circle: "+area);
	}
}


public class Fact {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a data: ");
		int data=scanner.nextInt();
		System.out.print("Enter a Number to cal factorial: ");
		int number=scanner.nextInt();
		System.out.print("Enter a radius: ");
		int radius=scanner.nextInt();
		
		Processor[] P= {new Factorial(data,number),new Circle(data,radius)};
		
		for(Processor arr:P)
		arr.process();

	}

}
