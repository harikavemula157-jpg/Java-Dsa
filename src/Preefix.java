import java.util.*;
public class Preefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] presum = new int[n];
        for (int i = 0; i < n; i++) {
            presum[i] = sc.nextInt();
        }
        int[] arr = new int[n];
        arr[0] = presum[0];
        for (int i = 1; i < n; i++) {
            arr[i] = presum[i] - presum[i - 1];
        }
        System.out.println(Arrays.toString(arr));
    }
}