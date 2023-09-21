package strings;

public class Encryption {
	public static String caesarCipher(String s, int k) 
    {
		 StringBuilder encryptedMessage = new StringBuilder();

	        for (int i = 0; i < s.length(); i++) {
	            char currentChar = s.charAt(i);

	            if (Character.isLetter(currentChar)) {
	                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
	                int newPosition = (currentChar - base + k) % 26;
	                char encryptedChar = (char) (base + newPosition);
	                encryptedMessage.append(encryptedChar);
	            } else {
	                encryptedMessage.append(currentChar);
	            }
	        }

	        return encryptedMessage.toString();
	    }
     public static void main(String[] args) {
		String s = caesarCipher("baLu", 3);
		System.out.println(s);
	}
}
