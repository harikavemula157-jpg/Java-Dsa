public class ReverseEach {
    public static void main(String[] args) {
        String s = "Hello This is Java";
        String[] words = s.split("\\s+");
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}