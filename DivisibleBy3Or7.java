package com.string.pack;

public class DivisibleBy3Or7 {
     public static void main(String[] args) {
    	 int a=1000;
		for(int i=1;i<=a;i++) {
			if(i%3==0 && i%7==0) {
				System.out.println(i);
			}
		}
	}
}
