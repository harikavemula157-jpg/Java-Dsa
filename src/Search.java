import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter key to search");
        int key = sc.nextInt();
        boolean found = false;
        for(int i = 0;i<arr.length;i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("the element is found");
            } else {
                System.out.println("the element is not found");
            }

        }
    }
