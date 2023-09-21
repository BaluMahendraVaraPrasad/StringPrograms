package com.string.pack;

public class SwapEveryTwoWords {

	public static void main(String[] args) {
		String s="Balu Mahendra Vara Prasad";
		String[] a = s.split(" ");
		
        for(int i=0;i<a.length-1;i+=2) {
          String temp=a[i];
          a[i]=a[i+1];
          a[i+1]=temp;
      }

      String temp = "";
      for (int i = 0; i < a.length; i++) {
          temp += a[i]+" ";
      }
		System.out.println(temp);
	}
}