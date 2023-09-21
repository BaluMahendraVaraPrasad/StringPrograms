package strings;

public class RemoveExtraSpaces1 {

	public static void main(String[] args) {
		String s="  Balu   Mahendra";
		char[]a=s.toCharArray();
		int i=0,j=0;
		String s1="";
		while(i<a.length) {
			while(j<a.length && a[j]!=' ')j++;
			String temp="";
			while(i<j) {
				temp+=a[i];
				i++;
			}
			s1+=temp+" ";
			while(i<a.length && a[j]==' ')j++;
			i=j;
		}
		System.out.println(s1.trim());
	}
}
