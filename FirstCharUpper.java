package com.string.pack;

public class FirstCharUpper {

	public static void main(String[] args) {
        String s = "balu mahendra varaprasad";
        String s1 = uppercase(s);
        System.out.println(s1);
    }

	public static String uppercase(String s) {
       char[] a=s.toCharArray();
        int j=0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (i == 0 || s.charAt(i - 1) == ' ') {
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);
                }
            }
            a[j++] = ch;
        }
        return new String(a);
    }
}
