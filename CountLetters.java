package com.string.pack;

import java.util.Scanner;

public class CountLetters {
   public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter String");
	String s=scn.nextLine();
	int count=0;
	while(s.length()>0) {
		char ch=s.charAt(0);
		String s1=s.replace(ch+"", "");
		 count=s.length()-s1.length();
		System.out.println(ch+"="+count);
		s=s1;
	}
	
	
}
}
