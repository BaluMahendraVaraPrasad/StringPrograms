package strings;

import java.util.HashMap;
import java.util.Iterator;

public class IndexOfEachCharUsingCollection {

	public static void main(String[] args) {
		
		String s="success is very important";
		HashMap<Character, String> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				String value = map.get(c);
				value+=","+i;
				map.put(c, value);
			}else {
				map.put(c, i+"");
			}
		}
		Iterator<Character> iterator=map.keySet().iterator();
		while(iterator.hasNext()) {
			Character next = iterator.next();
			String string = map.get(next);
			System.out.println(next+"="+string);
		}
	}
}
