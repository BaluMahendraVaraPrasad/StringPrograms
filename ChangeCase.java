package strings;

public class ChangeCase {
   public static void main(String[] args) {
	String s="Balu";
	char ch1=' ';
	String s1="";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='a' && ch<='z') {
			ch1=(char) (ch-32);
		}
		else if(ch>='A' && ch<='Z') {
			ch1=(char) (ch+32);
		}
		s1+=ch1;
	}
	System.out.println(s1);
}
}
