import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the entire line of words at once
        String input = sc.nextLine();

        // Split input into individual words by spaces
        String[] words = input.split("\\s+");

        HashMap<String, Integer> hm = new HashMap<>();

        // Count frequencies
        for (String word : words) {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }

        // Print word frequencies
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "_" + entry.getValue());
        }

        sc.close();
    }
}