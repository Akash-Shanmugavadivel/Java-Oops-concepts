package Files;

import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) throws  ClassNotFoundException{
        StudentManage stuManage = new StudentManage();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter option:");
        int op = sc.nextInt();
        sc.nextLine();  // Consume the newline character left by nextInt()

        switch (op) {
            case 1:
                System.out.println("Enter name:");
                String name = sc.nextLine();

                System.out.println("Enter Register No:");
                String regno = sc.nextLine();

                System.out.println("Enter CGPA:");
                float cgpa = sc.nextFloat();

                System.out.println("Enter Year:");
                int year = sc.nextInt();
                sc.nextLine();  // Consume the newline character left by nextInt()

                System.out.println("Enter Department:");
                String dept = sc.nextLine();

                // Create a new student object
                Students newStudent = new Students(cgpa, dept, name, regno, year);

                // Add the student to the list
                stuManage.addStudent(newStudent);
                System.out.println("Student added successfully.");
                break;

            // Option for displaying all students
            case 2:
                System.out.println("Displaying all students:");
                stuManage.displayStudents();
                break;

            // Default case for unhandled options
            default:
                System.out.println("Invalid option. Exiting.");
                break;
        }

        sc.close();  // Close the scanner to avoid resource leak
    }
}

