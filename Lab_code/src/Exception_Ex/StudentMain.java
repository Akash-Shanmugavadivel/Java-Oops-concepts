package Exception_Ex;

import java.io.IOException;
import java.util.Scanner;
//import inheritance.Employee;



public class StudentMain {
    static boolean  checkMark(int mark) throws Exception_Ex.InvalidMarkException {
        if (mark >= 0 && mark <= 100) {
            return true;
        } else {
            throw new InvalidMarkException("Mark is Invalid. It should be between 0 and 100.");
        }
    }
    static int[] getMarks (Scanner sc) {
        int marks[]=new int[Student.sub];
        for (int j = 0; j < Student.sub; j++) {
            while(true) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                int mark = sc.nextInt();
                try {
                    if (checkMark(mark)) {
                        marks[j] = mark;
                        break;
                    }
                } catch (InvalidMarkException e) {
                    System.out.println("InvalidMarkException: " + e.getMessage());
                }
            }
        }
        sc.nextLine();
        return marks;
    }
    public static void main(String[] args) throws InvalidMarkException, IOException {
       Scanner sc = new Scanner(System.in);
//        Employee emp1=new Employee();
        System.out.println("Enter the number of students: ");
        int stuSize = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[stuSize];
        for (int i = 0; i < stuSize; i++) {
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Roll No: ");
            String rollNo = sc.nextLine();
            int marks[] = getMarks(sc);

            students[i] = new Student(name, rollNo, marks);
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.displayStudentInfo();
            System.out.println();  // Blank line between students
        }

        sc.close();
    }
}
