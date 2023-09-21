package strings;

public class OccurenceOfWords1 {
   public static void main(String[] args) {
	String s="Balu Mahendra Vara Prasad ";
	int count=1;
	for(int i=0;i<s.length()-1;i++) {
		if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) count++;
		
	}
	System.out.println(""+count);
}
}
