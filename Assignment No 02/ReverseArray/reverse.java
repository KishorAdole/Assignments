/*
Write a program to reverse the array elements.
*/


import java.util.*;

class ReverseArray{

		public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		int[] arr = new int[size];

		for(int i=0;i<arr.length;i++){

			arr[i]=scanner.nextInt();
		
			}

		System.out.print("Reverse Array : ");
		for(int i=arr.length-1;i>=0;i--){

		System.out.print(arr[i]+" ");
			}
		}
	}