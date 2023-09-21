package strings;

public class Encryption2 {
	 public static void main(String[] args) {
			String s = encrypt("Balu", 3);
			System.out.println(s);
		}
	 public static String encrypt(String s, int n) {
	        String s1 = "";

	        for (int i=0; i<s.length();i++) {
	            char ch = s.charAt(i);

	            if (ch>='A' && ch <='Z') {
	                int m = (ch-'A'+n) % 26;
	                char ch1 = (char) ('A' + m);

	                s1 += ch1;
	            } else if (ch>='a' && ch<='z') {
	                int m = (ch-'a'+n) % 26;
	                char ch2 = (char) ('a' + m);

	                s1 += ch2;
	            } else {
	                s1 += ch;
	            }
	        }

	        return s1;
}
}
