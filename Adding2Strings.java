package strings;

public class Adding2Strings {
	public static void main(String[] args)
	{
		String s1="hello";
		String s2="woRld";
		s1=s1.substring(0,1).toUpperCase()+s1.substring(1).toLowerCase();
		s2=s2.substring(0,1).toUpperCase()+s2.substring(1).toLowerCase();
		System.out.println(s1+" "+s2);

	}

}
