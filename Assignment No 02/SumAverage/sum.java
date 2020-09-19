/*
Program to show sum and average of 10 element array. 
Accept array elements from user.
*/


import java.util.*;

class SumAverage{

		public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);

		int [] arr = new int[10];
		int sum=0;
		int avg=0;
		System.out.println("Enter ten Numbers");		
		for(int i=0;i<arr.length;i++){

		arr[i]= scanner.nextInt();
		}

		for(int i=0;i<arr.length;i++){

			sum+=arr[i];
		}

		avg=sum/arr.length;
		System.out.println("Sum : "+sum+" average : "+avg);

		}
}
			
