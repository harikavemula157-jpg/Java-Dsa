import java.util.*;

public class sortasdes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter numbers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("\nOriginal List: " + list);
        Collections.sort(list);
        System.out.println("Ascending Order: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order: " + list);

        sc.close();
    }
}
