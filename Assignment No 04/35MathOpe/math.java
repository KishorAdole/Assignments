/*
Create a class MathOperation that has four static methods.
add() method that takes two integer numbers as parameter and returns the sum of the numbers. 
subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. 
multiply() method that takes two integer numbers as parameter andreturns the product. 
power() method that takes two integer numbers as parameter and returns the power of first number to second number. 
Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of MathOperation class by providing entered numbers and 
prints the return values of every method.
*/


import java.util.*;

class MathOperation{

		public static int add(int a, int b){

			return (a+b);

			}

		public static int subtract(int a, int b){

			return (a-b);

			}

		public static int multiply(int a, int b){

			return (a*b);
			
			}

		public static int power(int a, int b){
			int p=1;
			for(int i=1;i<=b;i++){
			    p*=a;
			 }
			return (p);

			}
}

class Main{

		public static void main(String[] args){
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter two numbers");
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			
			System.out.println("Addition: "+MathOperation.add(a,b));
			System.out.println("Subtraction: "+MathOperation.subtract(a,b));
			System.out.println("Multiplication: "+MathOperation.multiply(a,b));
			System.out.println("Power: "+MathOperation.power(a,b));
		}

}


