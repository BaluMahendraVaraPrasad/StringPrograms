package strings;

public class StringAr {
   public static void main(String[] args) {
	String[]a= {"[3,4]","[1,8,9]"};
	for (String str : a) {
	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if(ch>='0' && ch<='9')
	        System.out.println(ch);
	    }
}
   }
}
