/*
Accept person’s gender (character m for male and f for female), age (integer), 
as input and then check whether person is eligible for marriage or not.
*/

import java.util.*;

class Criteria{

		public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter person's gender:  M for male and F for female");
		char gender = scanner.next().charAt(0);
		System.out.println("Enter person's age");
		int age=scanner.nextInt();
		
		if((age>=18 && gender=='F')||(age>=21 && gender=='M')){

			System.out.println("Person is eligible for marriage");
		}
		else
		{
			System.out.println("Person is not eligible for marriage");
		}
	}
}

