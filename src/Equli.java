import java.util.Arrays;
public class Equli {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 3};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int lhs = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
            if(lhs==sum) {
                System.out.println(i);
            }
            lhs += arr[i];
        }
    }
}