public class Anagram4 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        if (s1.length() != s2.length()) {
            System.out.println("not Anagram");
            return;
        }
        int[] freq = new int[26];
        for (char ch : s1.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : s2.toCharArray()) {
            freq[ch - 'a']--;
        }
        boolean anagram = true;
        for (int value : freq) {
            if (value != 0) {
                anagram = false;
                break;
            }
        }

        System.out.println(anagram ? "Anagram" : "Not Anagram");
    }
}