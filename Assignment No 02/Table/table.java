/*
Write a program to print table of any entered number using loop.
*/


import java.util.*;

class Table{

		public static void main(String args[]){

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter any number");
			int number = scanner.nextInt();
		
			for(int i=1;i<=10;i++){

			System.out.println(number+" x "+i+" = "+(i*number));
			}
		}
	}