import java.util.*;

class Student {

    String name;
    double cgpa;

    Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }
}
public class StuDept2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<Student>> departments = new HashMap<>();
        System.out.print("Enter number of departments: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter department name: ");
            String dept = sc.next();

            System.out.print("Enter number of students: ");
            int m = sc.nextInt();

            ArrayList<Student> students = new ArrayList<>();

            for (int j = 0; j < m; j++) {

                System.out.print("Enter student name: ");
                String name = sc.next();

                System.out.print("Enter CGPA: ");
                double cgpa = sc.nextDouble();

                students.add(new Student(name, cgpa));
            }

            departments.put(dept, students);
        }
        for (ArrayList<Student> students : departments.values()) {

            students.sort((a, b) ->
                    Double.compare(b.cgpa, a.cgpa));
        }

        System.out.println("\n--- Department Wise Students ---");

        for (Map.Entry<String, ArrayList<Student>> entry :
                departments.entrySet()) {

            System.out.println("\nDepartment: " + entry.getKey());

            for (Student s : entry.getValue()) {
                System.out.println(s.name + " - " + s.cgpa);
            }
        }

        System.out.print("\nEnter department to search: ");
        String search = sc.next();

        if (departments.containsKey(search)) {

            System.out.println("\nStudents in " + search + ":");

            for (Student s : departments.get(search)) {
                System.out.println(s.name + " - " + s.cgpa);
            }

        } else {
            System.out.println("Department not found");
        }
    }
}