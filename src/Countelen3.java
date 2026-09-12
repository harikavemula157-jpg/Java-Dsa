import java.util.*;
public class Countelen3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : arr)
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        int count = 0;
        for (int x : hm.keySet()) {
            if (hm.get(x) > n / 3)
                count++;
        }
        System.out.println(count);
    }
}