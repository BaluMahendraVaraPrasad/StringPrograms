package com.string.pack;

import java.util.Stack;

public class BalancedString {
   public static void main(String[] args) {
	boolean res=isBalanced("[{()}] ");
	System.out.println(res);
}
   public static boolean isBalanced(String s) {
	   if(s.length()==0)return false;
	   Stack <Character>stack=new Stack<Character>();
	   for(int i=0;i<s.length();i++) {
		   char ch1=s.charAt(i);
		   if(ch1=='['|| ch1=='{'|| ch1=='(') {
			   stack.push(ch1);
		   }
		   else if(ch1==']'|| ch1=='}' || ch1==')') {
			   if(stack.isEmpty() || !pair(stack.pop(), ch1))return false;
		   }
		   }
	     return stack.isEmpty() ;
	   }
     public static boolean pair(char ch1,char ch2) {
    	 if(ch1=='[' && ch2==']') return true;
    	 if(ch1=='{' && ch2=='}') return true;
    	 if(ch1=='(' && ch2==')') return true;
    	 return false;
     }
   }
