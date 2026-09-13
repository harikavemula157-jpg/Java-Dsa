import java.util.*;

public class primeseive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] spf = new int[n + 1];

        // Initialize
        for (int i = 0; i <= n; i++) {
            spf[i] = i;
        }

        // Build SPF array
        for (int i = 2; i * i <= n; i++) {

            if (spf[i] == i) {

                for (int j = i * i; j <= n; j += i) {

                    if (spf[j] == j) {
                        spf[j] = i;
                    }

                }

            }

        }

        System.out.print("Prime Factors: ");

        while (n != 1) {

            System.out.print(spf[n] + " ");

            n = n / spf[n];

        }

        sc.close();
    }
}