package strings;

public class SecretKey {
	 public static void main(String[] args) {
	        long input1 = 9880127431l;
	        String input2 = "johnson";
	        String key = secretKey(input1, input2);
	        System.out.println(key);
	    }
	 public static boolean isEven(long num) {
		 if(num%2!=0)return false;
		 return true;
	 }
	 public static boolean isOdd(long num) {
		 if(num%2==0)return false;
		 return true;
	 }
	 public static long reverse(long num) {
		 long rev=0;
		 while(num>0) {
			 long rem=num%10;
			 rev=rev*10+rem;
			 num/=10;
		 }
		return rev;
	 }
	 public static String reverseString(String s) {
		 String s1="";
		 for(int i=s.length()-1;i>=0;i--) {
			 char c = s.charAt(i);
			 s1+=c;
		 }
		 return s1;
	 }
	 public static String secretKey(long num,String s) {
		 long rev = reverse(num);
		 long sum=0;
		 String s1="";
		 while(rev>0) {
			 long rem=rev%10;
			 sum=sum+rem;
			 if(!isEven(sum)) {
				continue;
				 }
			 else if(isEven(sum)){
				 //sum=sum+rem;
				 s1+=sum;
				 for(int i=s.length()-1;i>=0;) {
					 char c = s.charAt(i);
					 s1+=c;
					 return s1;
				 }
			 }
			 else if(!isOdd(sum)) {
				 continue;
			 }
			 else if(isOdd(sum)){ 
				 s1+=sum;
				 return s1;
			 }
			 rev/=10;
		 }
		return s1;
		 
	 }

	    
}