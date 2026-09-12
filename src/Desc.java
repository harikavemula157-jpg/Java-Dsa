import java.util.*;
public class Desc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        TreeMap<Integer, Integer> map =
                new TreeMap<>(Collections.reverseOrder());
        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() <= k)
                System.out.print(entry.getKey() + " ");
        }
    }
}