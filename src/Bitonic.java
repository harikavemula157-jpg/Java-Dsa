import java.util.*;
public class Bitonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int i = 1;
        while (i < n && arr[i] > arr[i - 1])
            i++;
        while (i < n && arr[i] < arr[i - 1])
            i++;
        if (i == n)
            System.out.println("perfect Bitonic");
        else
            System.out.println("not Bitonic");
    }
}