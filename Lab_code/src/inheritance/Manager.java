package inheritance;
import java.util.*;
//import LinkedList.Node;
public class Manager extends Employee implements ProgrammerManager{
    public int teamSize;
    int projectStatus;
    List<String> proLang;


    public Manager(String Name,int Emp_id,String PhoneNo,int Exp,int team_s){
        //pro Lang not know - no projects
        super(Name,Emp_id,PhoneNo,Exp);
        teamSize=team_s;
    }
    public Manager(String Name,int Emp_id,String PhoneNo,int Exp,int team_s,int projectStatus){
        //have project
        super(Name,Emp_id,PhoneNo,Exp);
        teamSize=team_s;
        this.projectStatus=projectStatus;
    }
    public Manager(String Name, int Emp_id, String PhoneNo, int Exp, int teamSize, int projectStatus, List<String> languages) {
       //pro Lang known
        super(Name, Emp_id, PhoneNo, Exp);
        this.teamSize = teamSize;
        this.projectStatus = projectStatus;
        this.proLang = languages;
    }
    // Method to print manager details
    void printManager() {
        System.out.println("Manager");
        System.out.println("Programmer");
        System.out.println("Name: "+this.Name);
        System.out.println("Employee Id: "+this.Emp_id);
        System.out.println("Phone No: "+this.PhoneNo);
        if(this.Exp==0)
            System.out.println("Fresher Employee");
        else
            System.out.println(this.Exp+" years of Experiance");
        System.out.println("Team Size: " + this.teamSize);
        System.out.println("Project Status: " + this.projectStatus);
        System.out.println("Programming Languages: " + this.proLang);
    }

    // Implementing methods from ProgrammerManager interface
    @Override
    public void writeCode() {
        System.out.println(this.Name + " is writing code as part of management duties.");
    }

    @Override
    public void debugCode() {
        System.out.println(this.Name + " is debugging code with the team.");
    }

    @Override
    public void displayProgrammingLanguages() {
        System.out.println("Programming language"+proLang);
    }

    @Override
    public void manageTeam() {
        System.out.println(this.Name + " is managing a team of " + this.teamSize + " members.");
    }

    @Override
    public void assignTasks() {
        System.out.println(this.Name + " is assigning tasks to the team.");
    }

    @Override
    public void reportProjectStatus() {
        switch (this.projectStatus) {
            case 1:
                System.out.println("Project is beginning.");
                break;
            case 5:
                System.out.println("Project is at an intermediate stage.");
                break;
            case 10:
                System.out.println("Project is completed.");
                break;
            default:
                System.out.println("Project is not started.");
        }
    }
}
