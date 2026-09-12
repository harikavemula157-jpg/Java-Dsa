import java.util.*;
public class PriorMajority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : arr)
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        for (int x : arr) {
            if (hm.get(x) > n / 3) {
                System.out.println(x);
                return;
            }
        }

        System.out.println(-1);
    }
}