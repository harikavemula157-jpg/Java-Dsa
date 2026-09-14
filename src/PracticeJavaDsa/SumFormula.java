package PracticeJavaDsa;

import java.util.*;

public class SumFormula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter " + (n - 1) + " elements:");
        for (int i = 0; i < n - 1; i++) {
            sum += sc.nextInt();
        }
        int expected = n * (n + 1) / 2;
        int missing = expected - sum;

        System.out.println("Missing element = " + missing);
    }
}