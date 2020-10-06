/*
Program to check whether number is prime or not.
*/



import java.util.*;

class Prime{

	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		boolean prime=isPrime(number);
		if(prime){
			System.out.println(number+" is a Prime Number");		
		}
		else
		System.out.println(number+" is not a Prime Number");
		
	}

	public static boolean isPrime(int number){
		
		if(number==0 && number==1){
			return false;	
		}
	
		for(int i=2;i<=number;i++){
			if(i%2==0){
			return false;
			}
		}
		return true;
	}

}