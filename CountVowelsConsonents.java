package com.string.pack;

import java.util.Scanner;

public class CountVowelsConsonents {
   public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter String ");
	String s=scn.nextLine();
	String vowels="aeiouAEIOU";
	int number=0;
	int vowelcount=0;
	int consonent=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(vowels.contains(ch+""))
			vowelcount++;
		else if(ch>='0'&& ch<='9') number++;
		else consonent++;
	}
	System.out.println("Vowels:"+vowelcount);
	System.out.println("Consonent:"+consonent);
	System.out.println("Numbers:"+number);
}
}
