package com.string.pack;

public class Encryption1 {
	public static String encryption(String s,int n) {
		char[]a=new char[26];
		char ch='a';
		for(int i=0;i<a.length;i++) {
			a[i]=ch;
			ch++;
		}
		String s2="";
		for(int i=0;i<s.length();i++) {
			char ch1=s.charAt(i);
			int index=ch1-'a'+n;
			s2+=a[index%26];
		}
		return s2;
	}
    public static void main(String[] args) {
		String es=encryption("balu", 3);
		System.out.println(es);
	}
}
