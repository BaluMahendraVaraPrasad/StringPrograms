package strings;

public class CountAlphabetsNumbers {
    public static void main(String[] args) {
		String s="Balu@$^1235";
		int alphabet=0,number=0,symbol=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&& ch<='Z' || ch>='a'&& ch<='z')alphabet++;
			else if(ch>='0' && ch<='9')number++;
			else symbol++;
		}
		System.out.println("Alphabets = "+alphabet);
		System.out.println("Number = "+number);
		System.out.println("Symbol = "+symbol);
	}
} 
