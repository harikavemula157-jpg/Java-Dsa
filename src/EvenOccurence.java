import java.util.*;
public class EvenOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int x : arr)
            tm.put(x, tm.getOrDefault(x, 0) + 1);
        ArrayList<Integer> result = new ArrayList<>();
        for (int x : tm.keySet()) {
            if (tm.get(x) % 2 == 0)
                result.add(x);
        }
        if (result.isEmpty())
            System.out.println(-1);
        else
            System.out.println(result);
    }
}