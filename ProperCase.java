package strings;

public class ProperCase {

	public static void main(String[] args) {
		String s="baLu mAhEndra";
		String[]a=s.split(" ");
		String s1="";
		for(String str:a) {
			s1+=str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
			s1+=" ";
		}
		
		s1=s1.trim();
	  System.out.println(s1);
	}
}
