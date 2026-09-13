import java.util.Scanner;
public class QueueMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] queue = new int[5];
        int front = 0, rear = -1;
        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Find Element");
            System.out.println("5. Size");
            System.out.println("6. IsEmpty");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            if (ch == 1) {
                if (rear == 4)
                    System.out.println("Queue Overflow");
                else {
                    System.out.print("Enter value: ");
                    queue[++rear] = sc.nextInt();
                }

            } else if (ch == 2) {

                if (front > rear)
                    System.out.println("Queue Underflow");
                else
                    System.out.println("Deleted: " + queue[front++]);

            } else if (ch == 3) {

                if (front > rear)
                    System.out.println("Queue Empty");
                else {
                    System.out.println("Queue elements:");
                    for (int i = front; i <= rear; i++)
                        System.out.println(queue[i]);
                }

            } else if (ch == 4) {

                System.out.print("Enter element to find: ");
                int x = sc.nextInt();

                boolean found = false;

                for (int i = front; i <= rear; i++) {
                    if (queue[i] == x) {
                        found = true;
                        break;
                    }
                }

                if (found)
                    System.out.println("Element Found");
                else
                    System.out.println("Element Not Found");

            } else if (ch == 5) {

                System.out.println("Size: " + (rear - front + 1));

            } else if (ch == 6) {

                System.out.println("Is Empty: " + (front > rear));

            } else if (ch == 7) {

                System.out.println("Exited");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
