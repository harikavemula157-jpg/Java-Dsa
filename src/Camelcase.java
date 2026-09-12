public class Camelcase {
    public static void main(String[] args) {
        String s = "helloWorldJava";
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }
}