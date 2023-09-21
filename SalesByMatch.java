package strings;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class SalesByMatch {
	  public static void main(String[] args) throws IOException {
		    Scanner sc=new Scanner(System.in);
	        System.out.println("enter");
	        int n = Integer.parseInt(sc.nextLine().trim());

	        List<Integer> ar = Stream.of(sc.nextLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(Collectors.toList());

	        int result = Result.sockMerchant(n, ar);

	       System.out.println(result);
	       sc.close();
	    }
	}
	
	class Result {

		 public static int sockMerchant(int n, List<Integer> ar) {
			    
		        Map<Integer, Integer> sockCount = new HashMap<>();
		        int pairCount = 0;

		        // Count the occurrence of each color
		        for (int color : ar) {
		            sockCount.put(color, sockCount.getOrDefault(color, 0) + 1);
		        }

		        // Count the number of pairs for each color
		        for (int count : sockCount.values()) {
		            pairCount += count / 2;
		        }

		        return pairCount;

		    }

	}
