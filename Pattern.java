package com.string.pack;

public class Pattern {
   public static void main(String[] args) {
	int n=5;
	int sp=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<sp;j++) {
			System.out.print(" ");
		}
		for(int k=n;k>=i;k--) {
			System.out.print(k);
		}
		System.out.println();
		sp++;
	}
	
	
	
}
}
