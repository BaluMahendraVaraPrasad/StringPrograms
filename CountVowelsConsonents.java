package strings;

public class CountVowelsConsonents {
   public static void main(String[] args) {
	String s="Balumahedra";
	String vowels="AEIOUaeiou";
	int vowelcount=0,conscount=0;
	for(int i=0;i<s.length();i++) {
		
		char ch=s.charAt(i);
		if(vowels.contains(ch+""))vowelcount++;
		else conscount++;
	}
	System.out.println("Vowels "+vowelcount);
	System.out.println("Consonent "+conscount);
}
}
