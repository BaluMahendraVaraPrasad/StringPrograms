package com.string.pack;

public class ReverseEachWord {
  public static void main(String[] args) {
	String s="java is an oop lang ";
	 String reversed = reverse(s);
     System.out.println(reversed);
  }
  public static String reverse(String s) {
	  char[]a=s.toCharArray();
		String s1="";
	    int i=0,j=0;
	    while(i<s.length()) {
	    	while(j<s.length() && a[j]!=' ')j++;
	    	int k=j-1;
	    	String t="";
	    	while(k>=i) {
	    	t=t+a[k];
	    	
	    	k--;
	    	if(k==i) {
	    		a[k]=toUpperCase(a[k]);
	    	}
	    	}
	    	s1+=t;
	    	
	    	if(j<a.length)s1+=" ";
	    	
	    	j++;
	    	i=j;
	    }
		return s1;
  }

  public static char toUpperCase(char ch) {
      if (ch>='a' && ch<='z') {
          return (char)(ch-32);
      }
      return ch;
  }
}
