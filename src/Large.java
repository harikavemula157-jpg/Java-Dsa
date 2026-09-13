import java.util.*;
public class Large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            pq.add(x);
        }
        System.out.println(pq.peek());
    }
}