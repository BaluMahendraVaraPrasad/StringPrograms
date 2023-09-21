package com.string.pack;

public class Demo {
   public static void main(String[] args) {
	String s1="Balu Mahendra VaraPrasad";
	System.out.println(s1.length());
	System.out.println(s1.charAt(15));
	System.out.println(s1.contains("sad"));
	System.out.println(s1.startsWith("Ba"));
	System.out.println(s1.endsWith("sad"));
	System.out.println(s1.equals("Balu Mahendra VaRa PrAsad"));
	System.out.println(s1.equalsIgnoreCase("BAlu MAheNdra VaRaPrAsaD"));
}
}
