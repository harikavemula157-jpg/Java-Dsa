import java.util.Arrays;
public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,5};
        Arrays.sort(arr);
        for(int i =1;i<arr.length;i++) {
            if(arr[i]==arr[i-1]) {
                System.out.println("duplicate found " +arr[i]);
            }
        }
    }
}