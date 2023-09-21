package strings;

public class RemoveConsecutiveChars {

	public static void main(String[] args) {
		String s="baauualalalu";
		//char c='z';
		for(int i=0;i<s.length()-1;i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			String temp=""+c1;
			if(c1==c2)temp+=c2;
			
			if(temp.length()>1) {
				String s1=s.replace(temp, "");
				i=-1;
				s=s1;
			}
		}
		System.out.println(s);
	}
}
