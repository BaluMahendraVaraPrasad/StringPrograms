package strings;

public class ReverseOfWords {

	public static void main(String[] args) {
		String s="Balu Mahendra Varaprasad";
		String[]a=s.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}
