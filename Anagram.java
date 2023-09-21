package com.string.pack;

import java.util.Scanner;

public class Anagram {
	public static boolean anagramMethod(String s1,String s2) {
		while(true) {
		if(s1.length()!=s2.length()) return false;
		if(s1.length()==0 && s2.length()==0)return true;
		char ch=s1.charAt(0);
		s1=s1.replace(ch+"", "");
		s2=s2.replace(ch+"", "");
		
		}
	}
  public static void main(String[] args) {
	  Scanner scn=new Scanner(System.in);
	  System.out.println("Enter String");
	  String s=scn.nextLine();
	  String s2=scn.next();
	 boolean s1=anagramMethod(s, s);
	System.out.println(s1);
}
}
