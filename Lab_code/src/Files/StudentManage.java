package Files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentManage {
    private static final String FILE_PATH = "student.dat";
    private List<Students> students;

    public StudentManage() {
        students = loadStudents();  // Load students from file if exists
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentManage that = (StudentManage) o;
        return Objects.equals(students, that.students);
    }

    // Method to add a student and save the list
    public void addStudent(Students stu) {
        students.add(stu);
        saveStudents();
    }

    // Method to display all students
    public void displayStudents() {
        for (Students s : students) {
            System.out.println(s.toString());
        }
    }

    // Method to load students from the file
    public List<Students> loadStudents() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Students>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading students: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    // Method to save students to the file
    public void saveStudents() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }
}
