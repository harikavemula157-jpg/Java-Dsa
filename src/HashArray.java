import java.util.*;

public class HashArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, ArrayList<Integer>> hm = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.next();

            ArrayList<Integer> marks = new ArrayList<>();

            System.out.println("Enter marks of 6 subjects:");
            for (int j = 0; j < 6; j++) {
                marks.add(sc.nextInt());
            }

            hm.put(name, marks);
        }

        String highestName = "";
        int highestTotal = -1;

        System.out.println("\nStudent Details:");
        for (Map.Entry<String, ArrayList<Integer>> entry : hm.entrySet()) {

            String name = entry.getKey();
            ArrayList<Integer> marks = entry.getValue();

            int total = 0;

            for (int mark : marks) {
                total += mark;
            }

            double avg = total / 6.0;

            String grade;

            if (avg >= 90)
                grade = "A";
            else if (avg >= 80)
                grade = "B";
            else if (avg >= 70)
                grade = "C";
            else if (avg >= 60)
                grade = "D";
            else
                grade = "F";

            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Total: " + total);
            System.out.println("Average: " + avg);
            System.out.println("Grade: " + grade);
            System.out.println();
            if (total > highestTotal) {
                highestTotal = total;
                highestName = name;
            }
        }

        System.out.println("Student with highest total: " + highestName);
        System.out.println("Highest Total: " + highestTotal);
    }
}