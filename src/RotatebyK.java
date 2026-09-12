import java.util.*;

public class RotatebyK {
    static void reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        k = k % n;

        reverse(a, 0, n - 1);

        reverse(a, 0, k - 1);

        reverse(a, k, n - 1);

        System.out.print("After clockwise rotation: ");

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}