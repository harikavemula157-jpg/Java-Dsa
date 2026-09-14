package PracticeJavaDsa;

public class Vowelno {
    public static void main(String[] args) {
        String s = "sky is blue fly high";
        String[] words = s.split("\\s+");
        for (String word : words) {
            boolean hasVowel = false;
            for (char ch : word.toLowerCase().toCharArray()) {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                    hasVowel = true;
                    break;
                }
            }
            if (!hasVowel) {
                System.out.println(word);
            }
        }
    }
}