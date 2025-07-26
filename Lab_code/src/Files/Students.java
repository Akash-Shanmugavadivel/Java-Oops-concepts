package Files;

import java.io.Serializable;

public class Students implements Serializable {
    String name;
    String Regno;
    float cgpa;
    int year;
    String dept;

    public Students(float cgpa, String dept, String name, String regno, int year) {
        this.cgpa = cgpa;
        this.dept = dept;
        this.name = name;
        Regno = regno;
        this.year = year;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegno() {
        return Regno;
    }

    public void setRegno(String regno) {
        Regno = regno;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Students{" +
                "cgpa=" + cgpa +
                ", name='" + name + '\'' +
                ", Regno='" + Regno + '\'' +
                ", year=" + year +
                ", dept='" + dept + '\'' +
                '}';
    }
}
