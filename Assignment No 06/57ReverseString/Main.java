/*
Write a program to reverse every word of the String.
*/
package com.student;

public class StringDemo3 {

	public static void main(String[] args) {
       String str= "This is a test string"; 
       String ch[]=str.split(" ");

       for(int i=0;i<ch.length;i++) {
          String str1=(String)ch[i];
          for(int j=(str1.length()-1);j>=0;j--) {
        	  System.out.print(str1.charAt(j));
          }
          System.out.print(" ");
       }
	}
}