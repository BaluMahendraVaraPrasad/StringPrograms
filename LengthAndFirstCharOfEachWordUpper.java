package strings;

public class LengthAndFirstCharOfEachWordUpper {
   public static void main(String[] args) {
	String s1="balu";
	String s2="mahendra";
	System.out.println(s1.length()+s2.length());
//	int i=s1.compareTo(s2);
//	if(i>0)System.out.println("Yes");
//	else System.out.println("No");
	s1=s1.substring(0,1).toUpperCase()+s1.substring(1).toLowerCase();
	s2=s2.substring(0,1).toUpperCase()+s2.substring(1).toLowerCase();
	System.out.println(s1+" "+s2);
}
}