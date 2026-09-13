import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Depart {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] tokens = input.split("\\s+");

        LinkedHashMap<String, String> hm = new LinkedHashMap<>();

        for (int i = 0; i < tokens.length - 1; i += 2) {
            hm.put(tokens[i], tokens[i + 1]);
        }

        for (Map.Entry<String, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "_" + entry.getValue());
        }

        sc.close();
    }
}