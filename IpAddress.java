package strings;

public class IpAddress {
  public static void main(String[] args) {
	String s="255.0.54.2125";
	if(validIp(s)) {
		System.out.println("is valid ip");
	}
	else System.out.println("not valid");
  }
    public static boolean validIp(String s) {
	  String []a=s.split("\\.");
	  if(a.length!=4)return false;
	  for(String str:a) {
		  int i = Integer.parseInt(str);
		  if(i<0 || i>255)return false;
	  }
	 if(s.endsWith("."))return false;
	  return true;
}
}