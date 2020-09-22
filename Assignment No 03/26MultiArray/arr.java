/*
Create an array of 17 elements in 5 rows.  
And calculate sum of all elements.
*/

import java.util.*;

class MultiArray{

		public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
/*
		int[][] arr = new int[5][4];
		int sum=0;
		System.out.println("Enter 20 elements of array");
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
				
				arr[i][j]=scanner.nextInt();
			
				}
			}
*/
	int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15},{16,17}};
	int sum=0;

		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
				
			sum=sum+arr[i][j];
			
				}
			}

		System.out.println("Sum : "+sum);		
			
}

}