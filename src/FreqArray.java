import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        // Populate the frequency map first
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(a[i])) {
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], 1);
            }
        }

        // Print all elements and their frequencies after populating
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "_" + entry.getValue());
        }

        sc.close();
    }
}
