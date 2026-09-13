import java.util.*;

public class MIssDupe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();

            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int missing = -1;
        int duplicate = -1;

        for (int i = 1; i <= n; i++) {

            if (!map.containsKey(i)) {
                missing = i;
            }

            if (map.getOrDefault(i, 0) == 2) {
                duplicate = i;
            }
        }

        System.out.println("Duplicate element = " + duplicate);
        System.out.println("Missing element = " + missing);
    }
}