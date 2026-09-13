public class Anagram3 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        if (s1.length() != s2.length()) {
            System.out.println("not Anagram");
            return;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (char ch : s1.toCharArray()) {
            freq1[ch - 'a']++;
        }
        for (char ch : s2.toCharArray()) {
            freq2[ch - 'a']++;
        }
        boolean anagram = true;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                anagram = false;
                break;
            }
        }

        System.out.println(anagram ? "Anagram" : "Not Anagram");
    }
}