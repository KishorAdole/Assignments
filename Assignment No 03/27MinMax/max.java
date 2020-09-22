/*	
Write a program to find the smallest and greatest number 
present in the array of integer type.
*/

import java.util.*;

class MaxMin{ 

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of an array");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<arr.length;i++){
		
			arr[i]=scanner.nextInt();

			}	

		Arrays.sort(arr);
		
		System.out.println("Smallest Number : "+arr[0]);
		System.out.println("Greatest Number : "+arr[arr.length-1]);   

	}
}                   