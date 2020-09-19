/*   
   Find the result of following expressions. 
   You need to determine the primitive data type of the variable by looking carefully 
   the given expression and initialize variables by any random value.
	A. y = x2 + 3x - 7 (print value of y) 	
	B. y = x++ + ++x (print value of x and y) 
	C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
	D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]

*/


import java.util.*;

class PrimitiveDataType{

		public static void main(String args[]){

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the value of x");
			int x = scanner.nextInt();
	
			int y= ((x*x)+(3*x)-7); //y = x2 + 3x - 7 (print value of y) 	
			System.out.println("First Expression  --> y = "+y);

			y= x++ + ++x; //y = x++ + ++x (print value of x and y)
			System.out.println("Second Expression --> x = " + x + " y = "+y);
			
			int z= x++ - --y - --x + x++ ; //z = x++ - --y - --x  +  x++ (print value of x ,y and z)
			System.out.println("Third Expression  --> x = "+x + ", y = "+y + ", z = "+z);

			System.out.println("Enter the Value of X and Y as true or false ");
			boolean X = scanner.nextBoolean();
			boolean Y = scanner.nextBoolean();
			boolean Z = X && Y || !(X || Y ); //z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
			System.out.println("Fourth Expression --> Z = "+Z);
			
			}
}

			 