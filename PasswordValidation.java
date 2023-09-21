package strings;

public class PasswordValidation 
{
	public static void main(String[] args) 
	{
		String s="@Balu@123";
		int num=0;
		int str=0;
		int sp=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.length()>=8) {
		   char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				num++;
			}
			else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				str++;
			}
     		else
			{
				sp++;
			}
		
		}
		}
		if(num>=1&& str>=1&&sp>=1)
		{
			System.out.println("valid password");
		}
		else
			System.out.println("not valid password");
		
		
	}

}
