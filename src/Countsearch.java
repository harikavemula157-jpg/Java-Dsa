import java.util.Scanner;
public class Countsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter key to search");
        int key = sc.nextInt();
        boolean index = false;
        int count = 0;
        for(int i = 0;i<arr.length;i++) {
            if (arr[i] == key) {
                index = true;
                count++;
            }
        }
        if(index) {
            System.out.println("no of times it occurs is:"+count);
        } else {
            System.out.println("the count is not found");
        }
    }
}


