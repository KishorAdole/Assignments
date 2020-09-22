/*
Write a program to reverse a given number.
*/


import java.util.*;

class ReverseNumber{

		public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int sum =0;
		int rem=0;
		while(number!=0){
		
			rem = (number%10);
			sum=sum*10+rem;

			number/=10;

			}
		System.out.println("Reverse Nummber: "+sum);
	
		}

	} 
				