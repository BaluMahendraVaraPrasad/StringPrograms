package strings;

public class CountLetter {
    public static void main(String[] args) {
		String s1="Baalu Maaahendra";
		String s2=m1(s1);
		System.out.println(s2);
	}
    static String m1(String s) {
    	char[]a=s.toCharArray();
    	String s2="";
    	int count=0,i=0;
    	char c;
    	while(i<a.length) {
    		c=a[i];
    		count=1;
    		while(i<a.length-1 && a[i+1]==c) {
    			count++;
    			i++;
    		}
    		s2=s2+count+c;
        	i++;
    	}
		return s2;
    	
    }
}
