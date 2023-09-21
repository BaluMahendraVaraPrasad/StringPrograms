package com.string.pack;

public class Swap1stAndLastChar {

	public static void main(String[] args) {
		String s="Balu Mahendra";
		String[] split = s.split(" ");
		for(String s1:split) {
			swap(s1);
		}
        
	}
	public static void swap(String s) {
		String s1="";
		char[] a = s.toCharArray();
		int i=0,j=s.length()-1;
		while(i<j) {
			
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i=j;
			 s1=new String(a);
		}
		System.out.print(s1+" ");
		
	}
}
