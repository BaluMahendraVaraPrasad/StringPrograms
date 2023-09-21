package strings;

public class ReverseStringLength {

	public static void main(String[] args) {
		String s="Balu Mahendra";
		String[]s1=s.split(" ");
		String replace=s.replace(" ", "");
		char[] reverse = reverse(replace);
		int i=0,j=0;
		String res="";
		while(i<reverse.length) {
			int k=0;
			String temp="";
			while(i<reverse.length && k<s1[j].length()) {
				temp+=reverse[i];
				i++;
				k++;
			}
			res+=temp+" ";
			j++;
		}
		System.out.println(res.trim());
		
	}
	public static char[] reverse(String s) {
		char[] c = s.toCharArray();
		int i=0,j=c.length-1;
		while(i<j) {
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		return c;
	}
	
}
