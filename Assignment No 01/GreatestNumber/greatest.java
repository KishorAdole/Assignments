/*
Program to find greatest in 3 numbers.
[once using if else statement and then using ternary operator ( logical operator)]
*/


import java.util.*;

class GreatestNumber{

	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		int N1 = scanner.nextInt();
		int N2 = scanner.nextInt();
		int N3 = scanner.nextInt();

		if(N1>N2 && N1>N3){

			System.out.println("N1 is Greatest amongst all");
		}
		else{

			if(N2>N3){

				System.out.println("N2 is Greatest amongst all");

				}
				else{

					System.out.println("N3 is Greatest amongst all");

					}
			}

		}

	}
/*
class Ternary{


		public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		int N1 = scanner.nextInt();
		int N2 = scanner.nextInt();
		int N3 = scanner.nextInt();


		(N1>N2) ? "N1 is Greatest":"N2 is greatest";

		}

	}


*/		