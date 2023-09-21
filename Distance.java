package com.string.pack;

import java.util.List;

public class Distance {
   public static void main(String[] args) {
	List<Integer> l=List.of(1,0,1,2,5,6,2);
	int i = minDistance(l);
	System.out.println(i);
	
}
   public static int minDistance(List<Integer> a) {
	   int minDistance =a.get(0);

       for (int i = 1; i < a.size(); i++) {
           for (int j = i + 1; j < a.size(); j++) {
               if (a.get(j) == a.get(i)) {
                   int distance = j - i;
                   minDistance = distance;
               }
           }
       }

       return minDistance==a.get(0)? -1:minDistance;
   }
}
