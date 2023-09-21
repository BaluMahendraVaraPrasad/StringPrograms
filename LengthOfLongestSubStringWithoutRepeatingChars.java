package strings;

public class LengthOfLongestSubStringWithoutRepeatingChars {
	  public int lengthOfLongestSubstring(String s) 
	    {
	        String temp="";
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	            if(!temp.contains(ch+""))
	            temp+=ch;

	        }
	        return temp.length(); 
	    }
	  public static void main(String[] args) {
		LengthOfLongestSubStringWithoutRepeatingChars s=new LengthOfLongestSubStringWithoutRepeatingChars();
		System.out.println(s.lengthOfLongestSubstring("Balu mahendra varaprasad"));
	}
	}
