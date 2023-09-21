package strings;

public class Panagram {
    public static void main(String[] args) {
    	String s="Ajhdke";
    	s=s.toLowerCase();
		System.out.println(panagram(s));
	}
    public static boolean panagram(String s) {
    	for(char c='a';c<='z';c++) {
    		if(!s.contains(c+""))return false;
    	}
    	return true;
    }
}
