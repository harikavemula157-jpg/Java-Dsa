import java.util.*;

public class CircularPrime {

    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int digits = String.valueOf(n).length();

        int divisor = (int)Math.pow(10, digits - 1);

        int rotation = n;

        boolean circularPrime = true;

        for (int i = 0; i < digits; i++) {

            if (!isPrime(rotation)) {

                circularPrime = false;
                break;
            }

            rotation = (rotation % divisor) * 10 + rotation / divisor;
        }

        if (circularPrime)
            System.out.println(n + " is Circular Prime");
        else
            System.out.println(n + " is Not Circular Prime");

        sc.close();
    }
}
