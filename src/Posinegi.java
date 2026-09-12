import java.util.Scanner;
public class Posinegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter elements");
        int positive = 0;
        int negative = 0;
        for(int i =0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>=0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println("no of positive numbers are:" +positive);
        System.out.println("no of negative numbers are:" +negative);
    }
}