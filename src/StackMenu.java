import java.util.Scanner;
public class StackMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[5];
        int top = -1;
        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("5. Size");
            System.out.println("6. IsEmpty");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            if (ch == 1) {
                if (top == 4)
                    System.out.println("Stack Overflow");
                else {
                    System.out.print("Enter value: ");
                    stack[++top] = sc.nextInt();
                }

            } else if (ch == 2) {
                if (top == -1)
                    System.out.println("Stack Underflow");
                else
                    System.out.println("Popped: " + stack[top--]);

            } else if (ch == 3) {
                if (top == -1)
                    System.out.println("Stack Empty");
                else {
                    System.out.println("Stack elements:");
                    for (int i = top; i >= 0; i--)
                        System.out.println(stack[i]);
                }

            } else if (ch == 4) {
                if (top == -1)
                    System.out.println("Stack Empty");
                else
                    System.out.println("Peek: " + stack[top]);

            } else if (ch == 5) {
                System.out.println("Size: " + (top + 1));

            } else if (ch == 6) {
                System.out.println("Is Empty: " + (top == -1));

            } else if (ch == 7) {
                System.out.println("Exited");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}