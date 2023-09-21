package com.string.pack;

public class A {
	public static void main(String[] args) 
	{
		String s="aabbsbcssb";
		System.out.println(StringChallenge(s));
		
	}
	public static String StringChallenge(String s)
    {
		char[] a=s.toCharArray();
	    String s2="";
	    
	    for(int i=0;i<a.length-1;i++)
	    {
	    	int count=1;
	    	if(a[i]==a[i+1])
	        {
	          count++;
	          i++;
	        
	        }
	      s2+=(char)(count+'0');
	      s2+=a[i];

	     
	      
	    }
	    return s2;
    }
}
