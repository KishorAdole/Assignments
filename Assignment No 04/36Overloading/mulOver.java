/*
Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
a. two integers 
b. three floats 
c. all elements of array 
d. one double and one integer
*/


import java.util.*;

class MathOperation{

	public void multiply(int a, int b){

		System.out.println("Mul: "+(a*b));

		}

	public void multiply(float a, float b, float c){

		System.out.println("Mul: "+(a*b*c));

		}

	public void multiply(int[] arr){
		
		int mul=1;
		for(int i=0;i<arr.length;i++){
			mul*=arr[i];
			}

		System.out.println("Mul: "+mul);

		}

	public void multiply(double a, int b){

		System.out.println("Mul: "+(a*b));

		}
}



class Main{

	public static void main(String[] args){
	
		 MathOperation m = new  MathOperation();		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Integer values:");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		m.multiply(a,b);
		
		System.out.println("Enter three float values:");
		float c=scanner.nextFloat();
		float d=scanner.nextFloat();
		float e=scanner.nextFloat();
		m.multiply(c,d,e);
		
		System.out.println("Enter the size of an array:");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=scanner.nextInt();
		} 
		m.multiply(arr);
		

		System.out.println("Enter one double and one integer values:");
		double f=scanner.nextDouble();
		int g=scanner.nextInt();
		m.multiply(f,g);
	}

}