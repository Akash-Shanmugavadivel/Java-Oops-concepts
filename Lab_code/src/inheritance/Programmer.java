package inheritance;
import java.util.*;
public class Programmer extends Employee implements ProgrammerManager{
    List<String>  proLang = new ArrayList<>();
    Programmer(String Name,int Emp_id,String PhoneNo,List<String> Lang)
    {
        //Fresher
        super(Name,Emp_id,PhoneNo);
        proLang=Lang;
    }
    Programmer(String Name,int Emp_id,String PhoneNo,int Exp,List<String> Lang)
    {
        //Exprenced
        super(Name,Emp_id,PhoneNo,Exp);
        proLang=Lang;
    }
    void printProgrammer(){
        System.out.println("Programmer");
        System.out.println("Name: "+this.Name);
        System.out.println("Employee Id: "+this.Emp_id);
        System.out.println("Phone No: "+this.PhoneNo);
        if(this.Exp==0)
            System.out.println("Fresher Employee");
        else
            System.out.println(this.Exp+" years of Experiance");
        System.out.println("Programming Languages: "+this.proLang);
    }
//    void SkillLevel(){
//        int count = this.proLang.size();
//        if(count>0&&count<2) System.out.println("Skill Level: Beginner");
//        else if(count=>2&&count<=4) System.out.println("Skill Level: Intermediate");
//        else System.out.println("Skill Level: Advance");
//    }

        public void writeCode() {
            if (!proLang.isEmpty()) {
                System.out.println(this.Name + " is writing code in " + proLang.get(0) + ".");
            } else {
                System.out.println(this.Name + " has no programming languages listed.");
            }
    }

    public void debugCode() {
        System.out.println(this.Name + " is debugging code.");
    }

    public void displayProgrammingLanguages() {
        System.out.println(this.Name + " knows the following programming languages: " + proLang);
    }
    @Override
    public void manageTeam() {
        System.out.println(this.Name + "  manage a team.");
    }

    @Override
    public void assignTasks() {
        System.out.println(this.Name + " does assign tasks.");
    }

    @Override
    public void reportProjectStatus() {
        System.out.println(this.Name + " is managing a project.");
    }
}
