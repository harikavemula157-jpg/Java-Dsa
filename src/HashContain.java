//import java.util.*;
//public class HashContain {
    //public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //HashSet<String> cities = new HashSet<>();
        //for (int i = 0; i < n; i++) {
            //cities.add(sc.next());
        //}
        //for (String city : cities) {
            //System.out.println(city);
        //}
    //}
//}
//import java.util.*;
//public class HashContain {
    //public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //LinkedHashSet<String> cities = new LinkedHashSet<>();
        //for (int i = 0; i < n; i++) {
            //cities.add(sc.next());
        //}
        //for (String city : cities) {
            //System.out.println(city);
        //}
    //}


// java.util.*;
//public class HashContain {
    //public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //TreeSet<String> cities = new TreeSet<>();
        //for (int i = 0; i < n; i++) {
           // cities.add(sc.next());
        //}
        //for (String city : cities) {
            //System.out.println(city);
        //}
   // }
//}

import java.util.*;
public class HashContain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<String> cities = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            cities.add(sc.next());
        }
        for (String city : cities) {
            System.out.println(city);
        }
    }
}