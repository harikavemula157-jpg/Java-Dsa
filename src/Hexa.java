import java.util.Scanner;
public class Hexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); ) {
            char ch = s.charAt(i);
            int count = 0;
            while (i < s.length() && s.charAt(i) == ch) {
                count++;
                i++;
            }
            System.out.print(count + "" + ch);
        }
    }
}