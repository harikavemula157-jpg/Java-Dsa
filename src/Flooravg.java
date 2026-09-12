import java.util.*;
public class Flooravg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr)
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int avg = (arr[i] + x) / 2;
            result[i] = hm.getOrDefault(avg, 0);
        }
        System.out.println(Arrays.toString(result));
    }
}