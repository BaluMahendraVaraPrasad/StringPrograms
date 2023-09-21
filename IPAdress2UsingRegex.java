package strings;

public class IPAdress2UsingRegex 
{
	    public static void main(String[] args){
	         String i="255.255.255.2555";
	        if( i.matches(new MyRegex().pattern)) {
	            System.out.println("valid");
	        }
	        else System.out.println("not valid");
	    }
}
	class MyRegex{
	    String num="([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	    String pattern=num+"."+num+"."+num+"."+num;
	}
