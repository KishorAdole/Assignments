/*
Create a class Tile to store the edge length of a square tile, and create another class Floor to store length and width of a rectangular floor. 
Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
*/


import java.util.*;

class Tile{

	protected int lengthOfTile;
	Tile( int lengthOfTile){
	this.lengthOfTile = lengthOfTile;	
	}

	public int getLength(){return lengthOfTile; }

}

class Floor extends Tile{

	private int length;
	private int width;
	private int totalTiles;

	//Floor( int lengthOfTile,int length, int width)
	Floor(int length, int width){
	//super(lengthOfTile);
	this.length=length;	
	this.width=width;

	}

	public void totalTiles(Tile t){
	totalTiles =(length*width)/(t.getLength()*t.getLength());
	System.out.println("Total no. of tiles required to cover the floor : "+totalTiles);
	//System.out.println("length if tile: "+lengthOfTile);
	
	}

}


class Main{
	
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the tile");
		int lengthOfTile=scanner.nextInt();
		System.out.println("Enter the length of the floor");
		int length=scanner.nextInt();
		System.out.println("Enter the width of the floor");
		int width=scanner.nextInt();
		
		Tile t=new Tile(lengthOfTile);
		Floor f = new Floor(length, width);
			f.totalTiles(t);	
	}

}