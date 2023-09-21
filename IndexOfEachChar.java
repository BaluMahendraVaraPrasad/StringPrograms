package strings;

public class IndexOfEachChar {

	public static void main(String[] args) {
        String str = "Balu Mahendra";
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean flag = false;
             //if(str.charAt(i)==' ')continue;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                System.out.print(c + " = ");
                for (int k = 0; k < str.length(); k++) {
                    if (str.charAt(k) == c) {
                        System.out.print(k + " ");
                    }
                    
                }
                System.out.println();
            }
        }
    }
}
