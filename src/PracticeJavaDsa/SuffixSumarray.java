package PracticeJavaDsa;

import java.util.*;
public class SuffixSumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for(int i = n - 2; i >= 0; i--)
            arr[i] = arr[i] + arr[i + 1];
        System.out.println(Arrays.toString(arr));
    }
}