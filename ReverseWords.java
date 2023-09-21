package com.string.pack;

public class ReverseWords{
	 public static void main(String[] args) {
		String s="Balu Mahendra";
		String s1="";
		String[]a=s.split(" ");
		for(String str:a) {
			s1+=rev(str);
			s1+=" ";
		}
		s1=s1.trim();
		System.out.print(s1);
	}
	 public static String rev(String s) {
		 char[]a=s.toCharArray();
		 int i=0,j=s.length()-1;
		 while(i<j) {
			 char temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			 i++;
			 j--;
		 }
		 return new String(a);
	 }
}