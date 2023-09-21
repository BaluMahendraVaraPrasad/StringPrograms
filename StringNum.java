package com.string.pack;

public class StringNum {
   public static void main(String[] args) {
	String str="helloworld";
	char[]arr=str.toCharArray();
	for(int i=0;i<arr.length;i++) {
		int count=1;
		boolean flag=true;
		if(arr[i]>='0'&& arr[i]<='9') continue;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
			count++;
			arr[j]=(char)(count+'0');
			flag=false;
			}
		}
		if(!flag) arr[i]='1';
	}
	System.out.println(new String(arr));
}
}
