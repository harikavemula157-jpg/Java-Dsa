package PracticeJavaDsa;

import java.util.Scanner;
public class WordsSep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split("#");
        for (String word : words) {
            boolean hasVowel = false;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                    hasVowel = true;
                    break;
                }
            }
            if (!hasVowel)
                System.out.println(word);
        }
    }
}