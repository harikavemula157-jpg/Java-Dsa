import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter elements");
        int even = 0;
        int odd = 0;
        for(int i =0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("no of even numbers are:" +even);
        System.out.println("no of odd numbers are:" +odd);
    }
}