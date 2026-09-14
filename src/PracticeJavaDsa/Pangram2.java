package PracticeJavaDsa;

public class Pangram2 {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        int[] freq = new int[26];
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }
        boolean pangram = true;
        for (int value : freq) {
            if (value == 0) {
                pangram = false;
                break;
            }
        }
        System.out.println(pangram ? "Pangram" : "Not Pangram");
    }
}