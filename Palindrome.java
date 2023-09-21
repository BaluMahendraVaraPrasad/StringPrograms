package com.string.pack;

import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter String");
	String s=scn.nextLine();
	String temp="";
	for(int i=s.length()-1;i>=0;i--) {
		char ch=s.charAt(i);
		temp+=ch;
		}
	if(s.equals(temp)) System.out.println("Palindrome");
	else System.out.println("Not a Palindrome");
}
}
