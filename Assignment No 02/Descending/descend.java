/*
Sort a ten element array in descending order.
*/


import java.util.*;

class Descending{

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
			System.out.println("Array in Ascending order : "+ Arrays.toString(arr));
			System.out.println("Array in descending order :");
			for(int i=arr.length-1;i>=0;i--){
			
				System.out.print(arr[i]+" ");

				}
			}

	}



/*
Arrays.sort(arr, Collections.reverseOrder());
System.out.println(Arrays.toString(arr));
*/				