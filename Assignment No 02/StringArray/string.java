/*
Initialize one String type of array and print the elements using for each loop.
*/

import java.util.*;

class StringArray{

		public static void main(String[] args){

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the size of an array");
			int size = scanner.nextInt();
				scanner.nextLine();
			String[] arr = new String[size];
			for(int i=0;i<arr.length;i++){
				arr[i]=scanner.nextLine();
				}
			System.out.println("Elements of array: ");
			for(String s : arr){

			System.out.print(s+" ");
			}
			
			//System.out.println(Arrays.toString(arr));

		}
}
