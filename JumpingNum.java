package strings;
import java.io.*;
import java.util.Scanner;

public class JumpingNum {
	 public static void main(String[] args) throws IOException {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter number");
	        String[] a = sc.nextLine().replaceAll("\\s+$", "").split(" ");

	        int x1 = Integer.parseInt(a[0]);

	        int v1 = Integer.parseInt(a[1]);

	        int x2 = Integer.parseInt(a[2]);

	        int v2 = Integer.parseInt(a[3]);

	        String result = Result1.kangaroo1(x1, v1, x2, v2);

	        System.out.println(result);
	    }
	
}
	class Result1 {

	    /*
	     * Complete the 'kangaroo' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts following parameters:
	     *  1. INTEGER x1
	     *  2. INTEGER v1
	     *  3. INTEGER x2
	     *  4. INTEGER v2
	     */

	    public static String kangaroo1(int x1, int v1, int x2, int v2) {
	    // Write your code here
	       if (v1 <= v2) {
	            return "NO"; 
	        }

	        if ((x2 - x1) % (v1 - v2) == 0) {
	            return "YES"; 
	        } else {
	            return "NO"; 
	        }
	    }
	}
