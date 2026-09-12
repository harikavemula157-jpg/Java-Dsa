public class CamelcaseWords {
    public static void main(String[] args) {
        String s = "oneTwoThree";
        int count = 1;
        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        System.out.println(count);
    }
}