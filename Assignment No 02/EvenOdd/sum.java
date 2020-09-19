/*
Write the program to find the sum of even elements and
sum of odd elements present in the array of integer type.
*/

import java.util.*;

class EvenOdd{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a size of array");	
	int size=scanner.nextInt();
	int[] arr=new int[size]; 
	int sumEven=0;
	int sumOdd=0;
	System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++){
			
			arr[i]=scanner.nextInt();
			
			}
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%2==0){
			
				sumEven+=arr[i];
			}
			else{
				
			  sumOdd+=arr[i];
			  }

			
			}
	
		System.out.println("Sum of Even Elements : "+sumEven);
		System.out.println("Sum of Odd Elements : "+sumOdd);
		
	}
}
		
