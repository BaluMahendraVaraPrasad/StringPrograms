package com.string.pack;

import java.util.Scanner;

public class SumNum {
   public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter String with numbers ");
	String s=scn.nextLine();
	int sum=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='0' && ch<='9') {
			int num=ch-48;
			sum=sum+num;
		}
	}
	System.out.println(sum);
}
}
