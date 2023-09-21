package com.string.pack;

public class Palindrome1 {
   public static void main(String[] args) {
	String s="malayalam";
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<=s.length()-1;j++) {
			if(isPalindrome(s, i, j))
				System.out.println(s.substring(i,j+1));
		}
	}
}
   public static boolean isPalindrome(String s,int start,int end) {
	   int i=start,j=end;
	   while(i<j) {
		   if(s.charAt(i)!=s.charAt(j))return false;
		   i++;
		   j--;
	   }
	   return true;
   }
}
