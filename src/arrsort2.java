import java.util.*;

public class arrsort2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.println("Enter Strings:");

        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextLine());
        }

        System.out.println("\nOriginal List: " + list);

        Collections.sort(list);
        System.out.println("Ascending Order: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order: " + list);

        sc.close();
    }
}