import java.util.*;
public class Pangram1 {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        HashMap<Character,Boolean> map = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            map.put(ch, false);
        }
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                map.put(ch, true);
            }
        }
        boolean pangram = true;
        for (boolean value : map.values()) {
            if (!value) {
                pangram = false;
                break;
            }
        }

        System.out.println(pangram ? "Pangram" : "Not Pangram");
    }
}