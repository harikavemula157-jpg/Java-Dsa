import java.util.*;
public class Pangram3 {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
        if (set.size() == 26)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
    }
}