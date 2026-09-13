import java.util.Scanner;
public class Sumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter elements");
        int sum  = 0;
        int avg = 0;
        for(int i =0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            avg = sum/arr.length;
        }

        System.out.println("the average is:" +avg);
    }
}