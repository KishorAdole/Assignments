/*
Write a program to calculate sum of 5 subject’s marks & find percentage. 
Take the obtained marks from user using Scanner class. 
Output should be in this format [ percentage marks = 99 % ]. 
Use concatenation operator here.
*/


import java.util.*;

class Percentage{

		public  static void main(String args[]){

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the marks of 5 subjects");
			int S1 = scanner.nextInt();
			int S2 = scanner.nextInt();
			int S3 = scanner.nextInt();
			int S4 = scanner.nextInt();
			int S5 = scanner.nextInt();
			
			int sum=(S1+S2+S3+S4+S5);
			double per=(sum/5);

			System.out.println("percentage marks = "+per+" %");

			}

	}
			