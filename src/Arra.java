import java.util.Scanner;
public class Arra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("enter the values:");
        int max = arr[0];
        for(int i = 0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }   System.out.println("the largest element is:" +max);
    }
}
