package strings;

public class RotationString1 {

	 public static boolean areRotations(String s1, String s2) {
	        if (s1.length() != s2.length()) {
	            return false;
	        }
	        char c1 = s2.charAt(0);
	        int index = -1;
	        for (int i = 0; i < s1.length(); i++) {
	            if (s1.charAt(i) == c1) {
	                index = i;
	                break;
	            }
	        }
	        if (index == -1 || !s1.substring(index).equals(s2.substring(0, s1.length() - index))) {
	            return false;
	        }
	        return s1.substring(0, index).equals(s2.substring(s1.length() - index));
	    }

	    public static void main(String[] args) {
	        String str1 = "abcde";
	        String str2 = "cdeab";

	        if (areRotations(str1, str2)) {
	            System.out.println("rotation");
	        } else {
	            System.out.println("not rotation");
	        }
	    }
}
