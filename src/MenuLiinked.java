import java.util.*;
public class MenuLiinked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int choice, value, pos;
        do {
            System.out.println("\n1.Insert at Beginning");
            System.out.println("2.Insert at End");
            System.out.println("3.Delete from Beginning");
            System.out.println("4.Delete from End");
            System.out.println("5.Insert at Position");
            System.out.println("6.Delete from Position");
            System.out.println("7.Search");
            System.out.println("8.Display");
            System.out.println("9.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    list.addFirst(value);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    list.addLast(value);
                    break;

                case 3:
                    if (list.isEmpty())
                        System.out.println("List is empty");
                    else
                        System.out.println("Deleted: " + list.removeFirst());
                    break;

                case 4:
                    if (list.isEmpty())
                        System.out.println("List is empty");
                    else
                        System.out.println("Deleted: " + list.removeLast());
                    break;

                case 5:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();

                    if (pos < 0 || pos > list.size()) {
                        System.out.println("Invalid position");
                    } else {
                        System.out.print("Enter value: ");
                        value = sc.nextInt();
                        list.add(pos, value);
                    }
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();

                    if (pos < 0 || pos >= list.size()) {
                        System.out.println("Invalid position");
                    } else {
                        System.out.println("Deleted: " + list.remove(pos));
                    }
                    break;

                case 7:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();

                    int index = list.indexOf(value);

                    if (index != -1)
                        System.out.println("Element found at position " + index);
                    else
                        System.out.println("Element not found");
                    break;

                case 8:
                    System.out.println("List: " + list);
                    break;

                case 9:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 9);

        sc.close();
    }
}