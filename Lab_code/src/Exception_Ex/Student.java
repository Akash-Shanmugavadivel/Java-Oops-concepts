package Exception_Ex;
import java.util.*;
public class Student {
    String name;
    String RollNo;
    public static final int sub=5;
    int  marks[];
    Student(String name,String rollno, int marks[]) {
        this.name = name;
        this.RollNo = rollno;
        this.marks = marks;
    }
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + RollNo);
        System.out.println("Marks: " + Arrays.toString(marks));
    }
}
