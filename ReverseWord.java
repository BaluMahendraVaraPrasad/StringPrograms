package strings;

public class ReverseWord {
    public static void main(String[] args) {
		String s="Balu Mahedra";
		String[]a=s.split(" ");
		String s1="";
		for(String s2:a) {
			s1+=rev(s2);
			s1+=" ";
		}
		System.out.println(s1);
		
	}
    public static String rev(String s) {
    	int i=0,j=s.length()-1;
    	char[]a=s.toCharArray();
    	while(i<j) {
    		char temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
    		i++;
    		j--;
    	}
    	return new String(a);
    }
}
