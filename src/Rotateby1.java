import java.util.*;

public class Rotateby1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int last = a[n - 1];

        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = last;

        System.out.print("After clockwise rotation: ");

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}