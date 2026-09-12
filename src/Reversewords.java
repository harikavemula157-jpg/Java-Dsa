public class Reversewords {
    public static void main(String[] args) {
        String s = "Hello This is Java";
        String[] words = s.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}