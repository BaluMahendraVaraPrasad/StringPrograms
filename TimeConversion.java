package strings;

public class TimeConversion {
	public static String timeConversion(String s) {
	    String[]a=s.split(":");
	    int hr=Integer.parseInt(a[0]);
	    int min=Integer.parseInt(a[1]);
	    
	    String ampm=a[2].substring(2);
	    int sec=Integer.parseInt(a[2].substring(0,2));
	    if(ampm.equals("PM")&& hr!=12)
	        hr+=12;
	    else if(ampm.equals("AM")&& hr==12)
	        hr=0;
	    return String.format("%02d:%02d:%02d", hr, min,sec);
	    }
	public static void main(String[] args) {
		String s="12:14:00AM";	
		String conversion = timeConversion(s);
		System.out.println(conversion);
	}
}