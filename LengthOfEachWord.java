package com.string.pack;

public class LengthOfEachWord {

	public static void main(String[] args) {
		String s="Balu Mahendra Varaprasad";
		String[] split = s.split(" ");
		for(String s1:split) {
			int result=s1.length();
			System.out.print(result+""+s1+" ");
		}
	}
}
