import java.util.*;

public class MissHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        HashMap<Integer, Boolean> map = new HashMap<>();
        System.out.println("Enter " + (n - 1) + " elements:");

        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            map.put(x, true);
        }

        for (int i = 1; i <= n; i++) {

            if (!map.containsKey(i)) {

                System.out.println("Missing element = " + i);
                break;
            }
        }
    }
}