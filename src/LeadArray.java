import java.util.*;

public class LeadArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        ArrayList<Integer> leaders = new ArrayList<>();

        int max = a[n - 1];

        leaders.add(max);

        for (int i = n - 2; i >= 0; i--) {

            if (a[i] > max) {

                max = a[i];

                leaders.add(max);
            }
        }

        Collections.reverse(leaders);

        System.out.print("Leaders: ");

        for (int x : leaders) {
            System.out.print(x + " ");
        }
    }
}