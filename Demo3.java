package strings;

public class Demo3 {

//	int i=m1();
//	Demo3(){
//		System.out.println("Constructor");
//	}
//	int m1() {
//		System.out.println("m1 method");
//		return 20;
//	}
//	{
//		System.out.println("Instance block");
//	}
	
	public static void main(String[] args) {
//		Animal a=null;
//		System.out.println(a.a);
		String s1=new String("Balu");
		String s2=new String("Mahendra");
		System.out.println(s1=s2);
	}
}
class Animal{
	static int a=10;
	int b=20;
}
class Dog extends Animal{
	
}
