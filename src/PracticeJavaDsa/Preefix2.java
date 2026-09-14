package PracticeJavaDsa;

import java.util.*;
public class Preefix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum;

            if (l == 0) {
                sum = prefix[r];
            } else {
                sum = prefix[r] - prefix[l - 1];
            }

            int count = r - l + 1;
            int mean = sum / count;

            System.out.print(mean + " ");
        }

        sc.close();
    }
}