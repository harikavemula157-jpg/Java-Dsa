import java.util.*;

public class Equili {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int total = 0;
        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();

            total += a[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            total -= a[i];

            if (leftSum == total) {

                System.out.println("Equilibrium index = " + i);
                return;
            }

            leftSum += a[i];
        }

        System.out.println("No equilibrium point");
    }
}