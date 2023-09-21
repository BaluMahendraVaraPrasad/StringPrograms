package com.string.pack;

import java.util.Scanner;

public class NextPalindrome {
   public static boolean isPalindrome(int num) {
	   int n,rem,rev=0;
	   n=num;
	   while(num>0) {
		   rem=num%10;
		   rev=rev*10+rem;
		   num/=10;
	   }
	   if(n==rev) {
		   return true;
	   }else return false;
   }
   public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter number");
	int num=scn.nextInt();
	if(isPalindrome(num))System.out.println("palindrome"+num);
	while(!isPalindrome(num)) {
		num=num+1;
	}
	System.out.println("Next Palindrome is "+num);
}
}
