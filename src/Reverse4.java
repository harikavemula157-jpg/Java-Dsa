import java.util.*;
public class Reverse4 {
    public static void main(String[] args) {
        String s = "Hello";
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            stack.push(ch);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}