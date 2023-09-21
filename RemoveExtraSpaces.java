package strings;

public class RemoveExtraSpaces {

	    public static void main(String[] args) {
	        String s = "  Balu   Mahendra ";
	        s=s.trim();
	        String s1 = "";

	        for(int i=0;i<s.length();i++) {
	            if(s.charAt(i)!=' ') {
	                s1 += s.charAt(i);
	            } else if(i>0 && s.charAt(i-1)!=' ') {
	                s1+=' ';
	            }
	        }

	        System.out.println(s1);
	    }
	}
