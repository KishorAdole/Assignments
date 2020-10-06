/*
Create a Thread class to print following star (*) pattern on screen with delay of 1 second between each * print. 
Number of lines in the pattern should be passed to the constructor of Thread class.  *  * * * *  * * * * * * * * * * 
Use this class in main method and ask user to enter number of lines to print.
*/


package com.student;

import java.util.Scanner;

class MylogicThread implements Runnable{
	private int lines;
	MylogicThread(int lines){
		this.lines=lines;
	}
	@Override
	public void run() {
		for(int i=0;i<lines;i++) {
			try {
				Thread.sleep(1000);
			System.out.print(Thread.currentThread().getName()+" "+" Started ");
				System.out.print("*"+" ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println(Thread.currentThread().getName()+" "+"Finished");
	}
}

public class Main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" "+"main Started");
		System.out.println("enter number of lines");
		Scanner sc=new Scanner(System.in);
		int line=sc.nextInt();
		MylogicThread mt=new MylogicThread(line);
		Thread t=new Thread(mt,"Child");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        sc.close();
        System.out.println(Thread.currentThread().getName()+" "+"main finished");
	}

}
