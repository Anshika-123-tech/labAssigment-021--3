import java.util.Scanner;

public class StudentManager {

    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        try {
            System.out.print("Enter Roll No (Integer): ");
            Integer roll = Integer.valueOf(sc.nextInt());
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            if (name.isEmpty())
                throw new Exception("Name cannot be empty.");

            System.out.print("Enter Email: ");
            String email = sc.nextLine();
            if (email.isEmpty())
                throw new Exception("Email cannot be empty.");

            System.out.print("Enter Course: ");
            String course = sc.nextLine();
            if (course.isEmpty())
                throw new Exception("Course cannot be empty.");

            System.out.print("Enter Marks: ");
            Double marks = Double.valueOf(sc.nextDouble());
            if (marks < 0 || marks > 100)
                throw new Exception("Marks must be between 0 and 100.");

            Thread t = new Thread(new Loader());
            t.start();
            t.join();

            Student s = new Student(roll, name, email, course, marks);
            System.out.println(s);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("\nProgram execution completed.");
        }
    }

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.addStudent();
    }
}
