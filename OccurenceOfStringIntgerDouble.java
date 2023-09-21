package strings;

public class OccurenceOfStringIntgerDouble{
    public static void main(String[] args) {
		String s="Balu 1 1.0 5 ";
		String[]a=s.split(" ");
		int str=0;
		int in=0;
		int d=0;
		for(String n:a) {
			 try {
	             Integer.parseInt(n);
	                in++;
	            } catch (NumberFormatException e1) {
	                try {
	                    Double.parseDouble(n);
	                    d++;
	                } catch (NumberFormatException e2) {
	                    str++;
	                }
	            }
		}
		System.out.println("String "+str);
		System.out.println("Integer "+in);
		System.out.println("Double "+d);
	}
}
