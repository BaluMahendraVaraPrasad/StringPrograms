package com.string.pack;

public class AddTwoNumWithoutUsingOp {
    public static void main(String[] args) {
		int i = add(15,22);
		System.out.println(i);
	}
    public static int add(int a,int b) {
    	for(int i=1;i<=b;i++) {
    		a++;
    	}
    	return a;
    }
}
