package strings;

public class RemoveDupWords {
    public static void main(String[] args) {
        String s = "Balu Mahendra Balu";
        String[] words = s.split(" ");
        String s1 = "";
   
        for (String word : words) {
            if (!s1.contains(word)) {
                s1 += word + " ";
            }
        }
        System.out.println(s1.trim());
    }
}
