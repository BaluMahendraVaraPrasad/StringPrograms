package com.string.pack;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
	     Scanner scn=new Scanner(System.in);
	     System.out.println("Enter Name");
	     String s=scn.nextLine();
	     char ch1=' ';
	     String temp="";
	     for(int i=0;i<s.length();i++) {
	    	 char ch2=s.charAt(i);
	    	 if(ch2>='A' && ch2<='Z') {
	    		 ch1=(char)(ch2+32);
	    	 }
	    	 else if(ch2>='a' && ch2<='z') ch1=(char)(ch2-32);
	    	 temp+=ch1;
	     }
	     System.out.println(temp);
	     
	}

}
