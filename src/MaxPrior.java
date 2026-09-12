import java.util.*;
public class MaxPrior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++)
            pq.add(sc.nextInt());
        while (!pq.isEmpty())
            System.out.print(pq.poll() + " ");
    }
}