package com.string.pack;

public class LInearSearch {
    public static void main(String[] args) {
		int[]a= {1,2,5,8,9};
		System.out.println(search(a, 5,0,a.length));
	}
    public static int search(int []a,int ele,int start,int end) {
    	   if(start>end)return -1;
    	   int mid=(start+end)/2;
    		if(ele==a[mid])return mid;
    		else if(ele<a[mid]) 
    			return search(a, ele, start, mid-1);
    		else return search(a, ele, mid+1, end);
    }
}
