/*
Write a program to convert very first character of every word in uppercase in a String.
*/


package com.student;

public class Main {

       public static void main(String[] args) {

       String str= "gEEks fOr GeeKs"; 
       String s=str.toLowerCase();
       String ch[]=s.split(" ");

       for(int i=0;i<ch.length;i++) {
          String str1=(String)ch[i];
          for(int j=0;j<str1.length();j++) {
        	  if(j==0) {
        	  String s1=str1.substring(0, 1);
        	  System.out.print(s1.toUpperCase());
        	  }else {
        		  System.out.print(str1.charAt(j));
        	  }
        	  
          }
          System.out.print(" ");
       }
	}
}