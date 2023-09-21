package com.string.pack;

public class RepeatingNumbers {
    public static void main(String[] args) {
		int[]a=new int[] {1,2,3,4,2,7,8,8,3};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int count=1;
				if(a[i]==a[j]) {
					count++;
					System.out.println(a[j]+" "+count);
				}
				
			}
			
		}
	}
}
