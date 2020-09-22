/*
Create an integer type 2-D array of size [3X3]. Take the elements from the user and 
then calculate the sum of the elements present in the diagonal.
*/

import java.util.*;
class Diagonal{

		public static void main(String[] args){
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the size of the array");
			int size = scanner.nextInt();
			int sum=0;
			int[][] arr = new int[size][size];
			for(int i=0;i<arr.length;i++){
				
			      for(int j=0;j<arr[i].length;j++){
				arr[i][j]=scanner.nextInt();
				}
			}

			for(int i=0;i<arr.length;i++){
				
			      for(int j=0;j<arr[i].length;j++){
				if(arr[i]==arr[j])
				sum+=arr[i][j];
				}
			}

		System.out.println("Sum : "+sum);

	}

}