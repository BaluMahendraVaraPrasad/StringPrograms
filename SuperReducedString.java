package strings;

import java.util.Scanner;

public class SuperReducedString {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String");
	String s=sc.nextLine();
	String s1 = superReducedString(s);
	System.out.println(s1);
	
}
   public static String superReducedString(String s) {
	
	   String temp="";  
	   for(int i=0;i<s.length();i++) {
		   char ch=s.charAt(i);
		   if(!temp.contains(ch+"")) {
			   temp+=ch;
		   }
	   }
	   
	return temp;
	    }
}
