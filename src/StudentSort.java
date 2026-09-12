import java.util.*;

public class StudentSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<Integer>> students = new HashMap<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            String name = sc.next();

            ArrayList<Integer> marks = new ArrayList<>();

            System.out.println("Enter 6 subject marks:");

            for (int j = 0; j < 6; j++) {
                marks.add(sc.nextInt());
            }

            students.put(name, marks);
        }

        String highestStudent = "";
        int highestTotal = -1;

        System.out.println("\n--- Student Details ---");

        for (Map.Entry<String, ArrayList<Integer>> entry : students.entrySet()) {

            String name = entry.getKey();
            ArrayList<Integer> marks = entry.getValue();

            int total = 0;

            System.out.print("\nName: " + name);
            System.out.print("\nMarks: ");

            for (int mark : marks) {
                System.out.print(mark + " ");
                total += mark;
            }

            double average = total / 6.0;

            char grade;

            if (average >= 90)
                grade = 'A';
            else if (average >= 80)
                grade = 'B';
            else if (average >= 70)
                grade = 'C';
            else if (average >= 60)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("\nTotal: " + total);
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);

            if (total > highestTotal) {
                highestTotal = total;
                highestStudent = name;
            }
        }

        System.out.println("\nStudent with highest total: " + highestStudent);
        System.out.println("Highest total: " + highestTotal);
    }
}
