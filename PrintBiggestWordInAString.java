package strings;

public class PrintBiggestWordInAString 
{
	public static void main(String[] args)
	{	
		String s="abcd abcdefgghj3454 abcdesg234567 dfghjk";
		int big=0;
		String biggest="";
		String s1="";
		String[] a=s.split(" ");
		for(String n:a)
		{
			for(int i=0;i<n.length();i++)
			{
				char ch=n.charAt(i);
				if((ch>='A'&& ch<='Z')||(ch>='a' && ch<='z'))
				{
					s1+=ch;	
				}
			}	
			s1+=" ";	
			String[] b=s1.split(" ");
			for(String p:b)
			{
				if(big<p.length())
				{
					big=p.length();
					biggest=p;
				
		}
	}
		}		
		System.out.println(biggest);	
	}

}
