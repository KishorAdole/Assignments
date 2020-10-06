/*
Write a program to demonstrate this() construct functionality.
*/



class This{

    private int i;
    private int j;
   This(){
      this(20,30);
      System.out.println("Zero parameter");
   }

   This(int i,int j){
       int k=i+j;
       System.out.println("Two parameter "+k);
   }
}

class Main{
    public static void main(String args[]) {
        This c=new This();
      
    }
}