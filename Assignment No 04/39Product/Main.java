/*
Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate and
 return total amount spent on all products. ( amount spent on single product = price of product * quantity of product )
*/


import java.util.Scanner;
class Product{
    private int pid;
    private int price;
    private int quantity;

    Product(int pid,int price,int quantity){
         this.pid=pid;
         this.price=price;
         this.quantity=quantity;

    }
}

class Main{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[5][3];

        for(int i=0;i<a.length;i++){
            System.out.println("Enter the "+(i+1)+" Product Details");     
             for(int j=0;j<a[i].length;j++){
                if(j==0){
                 System.out.print("Pid = ");
                 a[i][j]=sc.nextInt();
                }

                if(j==1){
                    System.out.print("Price = ");
                    a[i][j]=sc.nextInt();
                }
                if(j==2){
                    System.out.print("Quantity = ");
                    a[i][j]=sc.nextInt();
                }

             }
        }

    int max=a[0][1];
    int c=0;
    int b=0;
      for(int i=0;i<a.length;i++){
           for(int j=1;j<=1;j++){
                if(a[i][j]>max){
                   max=a[i][j]; 
                    c=i;
                    b=j;
                }
           }
       }
       System.out.println(max);
       System.out.println(a[c][b-1]);
   }
}