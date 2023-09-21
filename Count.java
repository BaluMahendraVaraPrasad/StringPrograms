package com.string.pack;

import java.util.Scanner;

public class Count {
   public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter Name with letters,characters and numbers");
	String s=scn.nextLine();
	int alphabet=0,number=0,symbol=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='A' && ch<='Z'|| ch>='a' && ch<='z') alphabet++;
		else if(ch>='0'&& ch<='9') number++;
		else symbol++;
		}
	System.out.println("Alphabets:"+alphabet);
	System.out.println("Numbers:"+number);
	System.out.println("Symbols:"+symbol);
	
}
}
