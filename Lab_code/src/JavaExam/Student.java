package JavaExam;

import java.util.Arrays;

public class Student {
    String name;
    String RollNo;
    public static final int sub = 5;
    int marks1[];
    int marks2[];

    Student(String name, String rollno, int marks1[], int marks2[]) {
        this.name = name;
        this.RollNo = rollno;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + RollNo);
        System.out.println("Marks: " + Arrays.toString(marks1));
        System.out.println("Marks: " + Arrays.toString(marks2));
    }
}
