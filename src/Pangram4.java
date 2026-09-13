public class Pangram4 {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        boolean[] visited = new boolean[26];
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                visited[ch - 'a'] = true;
            }
        }
        boolean pangram = true;
        for (boolean value : visited) {
            if (!value) {
                pangram = false;
                break;
            }
        }
        System.out.println(pangram ? "Pangram" : "Not Pangram");
    }
}