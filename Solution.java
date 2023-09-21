package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter ");
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        MaxMin.miniMaxSum(arr);

        bufferedReader.close();

	   
	}

        class MaxMin {
	    
	        public static void miniMaxSum(List<Integer> arr) {
	    	    // Write your code here
	    	    int min=arr.get(0);
	    	    int max=arr.get(0);
	    	    int sum=0;
	    	    for(int i=0;i<arr.size();i++){
	    	        
	    	        if(min>arr.get(i))min=arr.get(i);
	    	        else max=arr.get(i);
	    	    }
	    	    for(int i=0;i<arr.size();i++){
	    	        sum+=arr.get(i);
	    	    }
	    	    int maxsum=sum-min;
	    	    int minsum=sum-max;
	    	    
	    	     System.out.print(minsum);

	    	    System.out.print(" "+maxsum);

	    	    }

	    }
	}
