package strings;

public class PalindromeWordsInAString {
	public static void main(String[] args) 
	{
		String s="speak malayalam madam";
		String[] a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			if(palindrome(a[i]))
			{
				System.out.println(a[i]);
			}
		}
		
	}
	public static boolean palindrome(String s1)
	{
		int i=0;int j=s1.length()-1;
		while(i<=j)
		{
			if(s1.charAt(i)!=s1.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}

