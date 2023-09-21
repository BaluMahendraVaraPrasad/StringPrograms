package strings;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(15);
		a.add(20);
		a.add(22);
		a.add(27);
		a.add(23);
		for(int i=0;i<a.size();i++) {
			if(a.get(i)%2!=0) {
				System.out.println(a.get(i));
			}
		}
		
		
		}
}
