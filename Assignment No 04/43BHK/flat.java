/*
Create a class OneBHK with instance variables roomArea, hallArea and price. 
Then create default constructor that initializes instance variables with some values and a parameterized constructor that takes values
for all instance variables and stores them in instance variables. 
Now create a method named show()  to print OneBHK’s instance variable values.
Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new instance variable room2Area. 
Then create default constructor to initialize all 4 instance variables and a parameterized constructor to take the values for initialization of all instance variables. 
Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using show method. 
Also print total amount of all flats. 
*/


import java.util.*;

class OneBHK{

		private int roomArea;
		private int hallArea;
		private int price;

		OneBHK(){
		roomArea=0;
		hallArea=0;
		price=0;
		}

		OneBHK(int roomArea,int hallArea,int price ){
			this.roomArea=roomArea;
			this.hallArea=hallArea;
			this.price=price;
		}

		public  void show(){

		System.out.print("RoomArea: "+roomArea+"HallArea: "+hallArea+"Price: "+price+" ");

		}
}


class TwoBHK extends OneBHK{

		private int room2Area;
		
		TwoBHK(){

		super();
		room2Area=0;

		}

		TwoBHK(int roomArea,int hallArea,int price,int room2Area){

		super(roomArea,hallArea,price);
		this.room2Area=room2Area;

		}
		
		public  void show(){

		super.show();
		System.out.print("Room2Area: "+room2Area);

		}
		

}


class Demo{

		public static void main(String[] args){
		
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter the size of an array");
			int size=scanner.nextInt();

			TwoBHK[] arr=new TwoBHK[size];

			for(int i=0;i<arr.length;i++){

			System.out.print("Enter Room Area : ");
			int roomArea=scanner.nextInt();

			System.out.print("Enter Hall Area : ");
			int hallArea=scanner.nextInt();

			System.out.print("Enter price  : ");
			int price=scanner.nextInt();
			
			System.out.print("Enter Room2 Area : ");
			int room2Area=scanner.nextInt();
			
			TwoBHK obj= new TwoBHK(roomArea, hallArea, price, room2Area);
			arr[i]=obj;
			}
			
		}

}
