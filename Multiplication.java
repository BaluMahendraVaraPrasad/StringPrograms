package com.string.pack;

public class Multiplication {
   public static void main(String[] args) {
	int[][]a= {{1,2,3},
			   {4,5,6},
			   {7,8,9}};
	int[][]b= {{1,2,3},
			   {4,5,6},
			   {7,8,9}};
	int[][]c=new int[a.length][a.length];
	multiply(a, b, c);
	for(int[]temp:c) {
		for(int n:temp) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
   public static void multiply(int[][]a,int[][]b,int[][]c) {
	   for(int i=0;i<a.length;i++) {
		   for(int j=0;j<a.length;j++) {
			   int sum=0;
			   for(int k=0;k<a.length;k++) {
				   sum+=a[i][k]*b[k][j];
			   }
			   c[i][j]=sum;
		   }
	   }
   }
}
