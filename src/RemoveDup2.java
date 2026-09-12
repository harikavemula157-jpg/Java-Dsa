import java.util.Scanner;
public class RemoveDup2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean[] visited = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!visited[ch - 'a']) {
                System.out.print(ch);
                visited[ch - 'a'] = true;
            }
        }
    }
}
