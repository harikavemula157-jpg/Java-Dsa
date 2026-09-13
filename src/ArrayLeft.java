//import java.util.*;
//public class ArrayLeft {
 // public static void main(String[] args) {
   //   Scanner sc = new Scanner(System.in);
     // int n = sc.nextInt();
       //nt[] arr = new int[n];
       //or (int i = 0; i < n; i++)
         //   arr[i] = sc.nextInt();
        //int max = arr[0];
        //int count = 1;
        //for (int i = 1; i < n; i++) {
          //  if (arr[i] > max) {
            //    count++;
              //  max = arr[i];
            //}
        //}
        //System.out.println(count);
    //}
//}
import java.util.*;

public class ArrayLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        int max = arr[0];
        result.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                result.add(arr[i]);
                max = arr[i];
            }
        }
        System.out.println(result);
    }
}