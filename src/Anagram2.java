import java.util.*;
public class Anagram2 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        boolean anagram = true;
        for (int value : map.values()) {
            if (value != 0) {
                anagram = false;
                break;
            }
        }

        System.out.println(anagram ? "Anagram" : "Not Anagram");
    }
}