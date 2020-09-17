/*
In a company an employee is paid as under: 
If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. 
If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. 
If the employee's salary is input by the user write a program to find his gross salary. 
[ formula : GS= Basic + DA + HRA ]
*/


import java.util.*;

class GrossSalary{

		public static void main(String args[]){
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter basic Salary");
			int basicSalary = scanner.nextInt();
			
			if(basicSalary<10000){
				
				double DA = (basicSalary*90)/100;
				double HRA = (basicSalary*10)/100;
			
				double grossSalary = basicSalary+DA+HRA;
				System.out.println("grossSalary "+grossSalary);

			}
			else{

			double DA=(basicSalary*98)/100;
			double HRA=2000;
			
			double grossSalary = basicSalary+DA+HRA;
			System.out.println("grossSalary "+grossSalary);
			}

		}
}
 
			