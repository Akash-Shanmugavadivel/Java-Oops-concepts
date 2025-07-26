package Files;

public class
Employee {
    String Name;
    int Emp_id;
    double salary;
    String Des;

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Employee(String Name, int Emp_id, double salary, String Des){
        this.Name= Name;
        this.Emp_id=Emp_id;
        this.salary=salary;
        this.Des=Des;
    }
    void printEmployee(){
        System.out.println("Employee : ");
        System.out.println(this.Name);
        System.out.println(this.Emp_id);
        System.out.println(this.salary);
        System.out.println(this.Des);
    }

    public void updatesalry(double salary){
        this.salary=salary;
    }
    public void salaryIncrement() {
        switch (Des) {
            case "Project Manager":
                this.salary += this.salary * 0.10; // 10%
                break;
            case "Software Engineer":
                this.salary += this.salary * 0.08; // 8%
                break;
            case "Data Analyst":
                this.salary += this.salary * 0.05; // 5%
                break;
            default:
                System.out.println("No increment for other designations.");
                break;
        }
    }
}
