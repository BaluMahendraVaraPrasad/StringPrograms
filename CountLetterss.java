package com.string.pack;

public class CountLetterss {
   public static void main(String[] args) {
	String s="scccgfffjd";
	System.out.println(count(s));
}
   public static String count(String s) {
	   char[] a=s.toCharArray();
	   String s1="";
	   int count,i=0;
	   char c;
	   while(i<a.length) {
		   c=a[i];
		   count=1;
		   while(i<a.length-1 && a[i+1]==c) {
			   count++;
			   i++;
		   }
		   s1=s1+count+c;
		   i++;
	   }
	   return s1;
   }
}
