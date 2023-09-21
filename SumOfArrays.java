package com.string.pack;

import java.util.Scanner;

public class SumOfArrays {
   public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter Size of an array");
	int size=scn.nextInt();
	int[]arr=new int[size];
	System.out.println("enter array elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scn.nextInt();
	}
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	System.out.println(sum);
	
}
}
