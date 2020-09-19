/*
Write a program to search an element in the array.
*/


import java.util.*;

class SearchElement{

	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		boolean flag=false;
		
		System.out.println("Enter the array elements");
	
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++){
		
			arr[i]=scanner.nextInt();

			}
		System.out.println("Enter a search Element");
		int searchElement=scanner.nextInt();
		for(int i=0;i<arr.length;i++){

		if(searchElement==arr[i]){
			flag=true;
			}
			else{
			    continue;
				}
		}
		if(flag){
		System.out.println("Element is found");
		}
		else
		System.out.println("Element is not found");
		
	}

}			
	
