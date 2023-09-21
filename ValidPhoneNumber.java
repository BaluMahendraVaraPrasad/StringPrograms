package strings;

import java.util.Scanner;

public class ValidPhoneNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone number ");
        String phoneNumber = scanner.nextLine();
        
        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    
	public static boolean isValidPhoneNumber(String s) {
      if(s.length()!=10)return false;
      char fd=s.charAt(0);
      if(fd<'6')return false;
      for(int i=0;i<s.length();i++) {
    	  char ch=s.charAt(i);
    	  if(ch<'0' || ch>'9')return false;
      }
	return true;
    }
}