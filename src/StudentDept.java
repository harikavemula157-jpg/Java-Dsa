import java.util.*;

public class StudentDept {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, ArrayList<String>> departments = new HashMap<>();

        System.out.print("Enter number of departments: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter department name: ");
            String dept = sc.next();

            System.out.print("Enter number of students: ");
            int m = sc.nextInt();

            ArrayList<String> students = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                System.out.print("Enter student name: ");
                students.add(sc.next());
            }

            departments.put(dept, students);
        }

        System.out.println("\n--- Department Wise Students ---");

        for (Map.Entry<String, ArrayList<String>> entry :
                departments.entrySet()) {

            System.out.println("\nDepartment: " + entry.getKey());

            for (String student : entry.getValue()) {
                System.out.println(student);
            }
        }

        System.out.print("\nEnter department to search: ");
        String search = sc.next();

        if (departments.containsKey(search)) {

            System.out.println("\nStudents in " + search + ":");

            for (String student : departments.get(search)) {
                System.out.println(student);
            }

        } else {
            System.out.println("Department not found");
        }
    }
}