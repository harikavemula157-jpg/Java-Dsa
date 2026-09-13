import java.util.Scanner;
public class FirstUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(Character.toUpperCase(word.charAt(0)));
            }
        }
    }
}