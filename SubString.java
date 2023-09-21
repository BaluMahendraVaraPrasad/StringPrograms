package com.string.pack;

public class SubString {

	public static void main(String[] args) {
//		String s="balu mahendra";
//		String[] split = s.split(" ");
//		String s2="";
//		for(String s1:split) {
//			s1=s1.substring(0,1).toUpperCase()+s1.substring(1).toLowerCase();
//			s2+=s1+" ";
//		}
//		System.out.println(s2.trim());
		   String input="balu mahendra";
		  String result = "";
	        boolean newWord = true;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (newWord && (ch>='A' && ch<='Z')) {
	                result += ch;
	                newWord = false;
	            } else if (newWord && (ch>='a' && ch<='z')) {
	                result += Character.toUpperCase(ch);
	                newWord = false;
	            } else {
	                result += Character.toLowerCase(ch);
	                if (ch == ' ') {
	                    newWord = true;
	                }
	            }
	        }
	        System.out.println(result);
	}
}
