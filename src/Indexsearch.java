import java.util.Scanner;
public class Indexsearch {
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
        for(int i = 0;i<arr.length;i++) {
            if (arr[i] == key) {
                index = true;
                System.out.println("the index of element is:" + i);
                break;
            }
        }
        if(index) {
            System.out.println("the index is  found");
        } else {
            System.out.println("the index is not found");
        }
    }
}


