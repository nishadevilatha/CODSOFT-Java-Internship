import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String grade;

    Student(int rollNo, String name, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
    }
}

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- STUDENT MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();
                    students.add(new Student(roll, name, grade));
                    System.out.println("Student added successfully");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found");
                    } else {
                        for (Student s : students) {
                            System.out.println("Roll: " + s.rollNo +
                                    ", Name: " + s.name +
                                    ", Grade: " + s.grade);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.rollNo == searchRoll) {
                            System.out.println("Student Found: " +
                                    s.name + ", Grade: " + s.grade);
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Student not found");
                    break;

                case 4:
                    System.out.print("Enter Roll No to remove: ");
                    int removeRoll = sc.nextInt();
                    boolean removed = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).rollNo == removeRoll) {
                            students.remove(i);
                            removed = true;
                            System.out.println("Student removed successfully");
                            break;
                        }
                    }
                    if (!removed)
                        System.out.println("Student not found");
                    break;

                case 5:
                    System.out.println("Exiting program");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
