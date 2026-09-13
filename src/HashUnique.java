//import java.util.*;
//public class HashUnique {
    //public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //int[] arr = new int[n];
        //HashSet<Integer> set = new HashSet<>();
        //for (int i = 0; i < n; i++) {
            //arr[i] = sc.nextInt();
            //set.add(arr[i]);
        //}
        //if (set.size() == n)
            //System.out.println("Yes");
        //else
            //System.out.println("No");
    //}
//}
//import java.util.*;
//public class HashUnique {
  //  public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
      //  int n = sc.nextInt();
        //HashSet<Integer> set = new HashSet<>();
        //for (int i = 0; i < n; i++) {
          //  int num = sc.nextInt();
            //if (!set.add(num)) {
              //  System.out.println("No");
                //return;
            //}
        //}
        //System.out.println("Yes");
    //}
//}
//import java.util.*;
//public class HashUnique {
  //  public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
      //  int n = sc.nextInt();
        //HashMap<Integer, Integer> map = new HashMap<>();
        //for (int i = 0; i < n; i++) {
          //  int num = sc.nextInt();
            //map.put(num, 1);
        //}
        //if (map.keySet().size() == n)
          //  System.out.println("Yes");
        //else
          //  System.out.println("No");
    //}
//}
import java.util.*;
public class HashUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int freq : map.values()) {
            if (freq != 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}