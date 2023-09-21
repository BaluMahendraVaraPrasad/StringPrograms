package com.string.pack;

import java.util.Scanner;

public class Panagram {
    public static boolean panagramMethod(String s) {
//    	s=s.toLowerCase();
    	for(char ch='a';ch<='z';ch++) {
    		if(!s.contains(ch+""))return false;
    	}
    	return true;
    }
    public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String");
		String s=scn.nextLine();
		boolean s1=panagramMethod(s);
		System.out.println(s1);
		
	}
}
