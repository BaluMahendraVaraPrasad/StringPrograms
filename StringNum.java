package strings;

public class StringNum {
   public static void main(String[] args) {
	String s="balu mahendra varaprasad";
	char[]a=s.toCharArray();
	for(int i=0;i<a.length;i++) {
		int count=1;
		boolean flag=true;
		if(a[i]>='0'&& a[i]<='9')continue;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
				a[j]=(char)(count+'0');
				flag=false;
			}
		}
		if(!flag)a[i]='1';
	}
	System.out.println(new String(a));
}
}
