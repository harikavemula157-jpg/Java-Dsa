package PracticeJavaDsa;

public class Printwords {
    public static void main(String[] args) {
        String s = "Hello World Java";
        String[] words = s.trim().split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }
}