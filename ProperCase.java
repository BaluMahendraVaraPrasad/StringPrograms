package com.string.pack;

import java.util.Scanner;

public class ProperCase {
  public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter String");
	String s1=scn.next();
	String s2="";
	String[]a=s1.split(" ");
	for(String s:a) {
		s2+=s1.substring(0,1).toUpperCase()+s1.substring(1).toLowerCase();
		s2+="";
	}
	s2=s2.trim();
	System.out.println(s2);
}
}
