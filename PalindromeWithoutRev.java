package com.string.pack;

import java.util.Scanner;

public class PalindromeWithoutRev {
	public static boolean palindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) 
				return false;
			i++;
			j--;
		}
		return true;
	}
    public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String");
		String s=scn.nextLine();
		if(palindrome(s)) System.out.println("Palindrome");
		else System.out.println("Not a Palindrome");
	}
}
