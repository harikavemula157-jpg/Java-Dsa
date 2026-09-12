import java.util.Arrays;
public class Kth {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7};
        Arrays.sort(arr);
        int k=4;
        System.out.println("the kth element is:" +arr[k-1]);
    }
}