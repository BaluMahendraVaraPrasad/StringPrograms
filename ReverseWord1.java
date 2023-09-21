package strings;

public class ReverseWord1 {
    public static void main(String[] args) {
		String s="Balu mahendra";
		char[]a=s.toCharArray();
		int i=0,j=0;
		String s1="";
		while(i<a.length) {
			while(j<a.length && a[j]!=' ')j++;
			int k=j-1;
			String temp="";
			while(k>=i) {
			temp+=a[k];
			k--;
			}
			s1+=temp;
			if(j<a.length)s1+=" ";
			j++;
			i=j;
		}
		System.out.println(s1);
	}
}
