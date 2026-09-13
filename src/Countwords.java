public class Countwords {
    public static void main(String[] args) {
        String s = "Hello Hi";
        String[] words = s.trim().split("\\s+");
        System.out.println(words.length);
    }
}