/*
Write a program to swap two numbers without using third variable.
*/

import java.util.*;

class SwapNumbers{

		public static void main(String args[]){

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter two Numbers");
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println("Before Swap: A = "+A+", "+" B = "+B);			
			A = (A*B)/A;
			B= (A*B)/A;

			System.out.println("After Swap: A = "+A+", "+" B = "+B);

			}

	}