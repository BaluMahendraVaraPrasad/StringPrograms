package com.string.pack;

public class SecondSmallest {
   public static void main(String[] args) {
	int[]a= {5,6,7,2,9};
	System.out.println(smallest(a));
}
   public static int smallest(int[]a) {
	   int s1=a[0],s2=a[0];
	   for(int i=1;i<a.length;i++) {
		   if(a[i]==s1)continue;
		   else if(a[i]<s1) {
			   s2=s1;
			   s1=a[i];
		   }
		   else if(a[i]<s2 || s1==s2) {
			   s2=a[i];
		   }
	   }
	return s2;
   }
}
