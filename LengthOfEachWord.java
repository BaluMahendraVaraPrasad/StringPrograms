package strings;

public class LengthOfEachWord {

	 public static void main(String[] args) {
	        String str = "Balu Mahendra Varaprasad";
	        String word = "";
	        
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            
	            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
	                word += c;
	            } else if (!word.isEmpty()) {
	                int length = 0;
	                char[] a = word.toCharArray();
	                for (char ch : a) {
	                    length++;
	                }
	                System.out.print(length+""+word+" ");
	                word = "";
	            }
	        }
	        if (!word.isEmpty()) {
	            int length = 0;
	            for (char ch : word.toCharArray()) {
	                length++;
	            }
	            System.out.println(length+""+word+" ");
	        }
	    }
}
