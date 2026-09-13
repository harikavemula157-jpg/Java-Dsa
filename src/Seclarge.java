import java.util.Scanner;
public class Seclarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter elements");
        int max = 0;
        int sec = 0;
        for(int i =0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                sec = max;
                max = arr[i];
            } else {
                sec = arr[i];
            }
        }
        System.out.println("the second largest is:" +sec);

    }
}