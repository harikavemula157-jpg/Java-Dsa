import java.util.*;

public class elementXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int xor = 0;
        System.out.println("Enter " + (n - 1) + " elements:");
        for (int i = 1; i <= n; i++) {
            xor = xor ^ i;
        }

        for (int i = 0; i < n - 1; i++) {
            xor = xor ^ sc.nextInt();
        }

        System.out.println("Missing element = " + xor);
    }
}