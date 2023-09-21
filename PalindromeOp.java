package strings;

public class PalindromeOp {
   public static int palindrome(String s) {
	     int operations = 0;
	        int i = 0;
	        int j = s.length() - 1;

	        while (i < j) {
	            char ch1 = s.charAt(i);
	            char ch2 = s.charAt(j);

	            operations += Math.abs(ch1 - ch2);

	            i++;
	            j--;
	        }

	        return operations;
	    }

	    public static void main(String[] args) {
	        String str = "BAlu";
	        int operations =palindrome(str);
	        System.out.println("Minimum operations required: " + operations);
	    }
}
