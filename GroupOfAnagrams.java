package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagrams {
    public static void main(String[] args) {
		String[]a= {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> list = groupOfAnag(a);
		System.out.println(list);
	}
    public static List<List<String>> groupOfAnag(String[]a){
    	List<List<String>> list= new ArrayList<>();
    	LinkedHashMap<String, List<String>> map=new LinkedHashMap<>();
    	for(int i=0;i<a.length;i++) {
    		char str[]=a[i].toCharArray();
    		Arrays.sort(str);
    		String s=String.valueOf(str);
    		if(map.get(s)!=null) {
    			List<String> l=map.get(s);
    			l.add(a[i]);
    			map.put(s, l);
    		}
    		else {
    			List<String> l=new ArrayList<>();
    			l.add(a[i]);
    			map.put(s, l);
    		}
    	}
    	for(Map.Entry<String, List<String>> ab:map.entrySet()) {
    		list.add(ab.getValue());
    	}
		return list;
    }
}
