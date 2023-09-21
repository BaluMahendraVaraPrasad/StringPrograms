package com.string.pack;

import java.util.Scanner;

public class NextPrime {
   public static boolean isPrime(int num) {
	   int count=0;
	   for(int i=1;i<=num;i++) {
		   
		   if(num%i==0) {
			   count++;
		   }
	   }
	   if(count!=2)return false;
	return true;
	   
   }
   public static int nextPrime(int num) {
	   num++;
	   for(int i=2;i<num;i++) {
		   if(num%i==0) {
			   num++;
			   i=2;
		   }
		   else continue;
	   }
	   return num;
   }
   public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scn.nextInt();
	if(isPrime(num)) {
		System.out.println(num+" is prime number");
	}
	else System.out.println(num+" is not a prime number");
	System.out.println("Next Prime number is "+nextPrime(num));
}
}
