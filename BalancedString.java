package strings;

import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		boolean res=isBalanced("{[][]}");
		System.out.println(res);
	}
	public static boolean isBalanced(String s) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='[' || ch=='{' || ch=='(')
				stack.push(ch);
			else if(ch==']' || ch=='}' || ch==')') {
				if(stack.isEmpty()|| !pair(stack.pop(), ch))return false;
			}
		}
		return stack.isEmpty();
	}
	public static boolean pair(char ch1,char ch2) {
		if(ch1=='[' && ch2==']')return true;
		if(ch1=='{' && ch2=='}')return true;
		if(ch1=='(' && ch2==')')return true;
		return false;
	}
}
