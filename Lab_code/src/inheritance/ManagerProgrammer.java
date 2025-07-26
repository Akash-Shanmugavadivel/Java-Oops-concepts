package inheritance;
import java.util.*;
// Programmer Interface
interface Developer {
    void writeCode();
    void debugCode();
    void displayProgrammingLanguages();
}

// Manager Interface
interface ManagerDir {
    void manageTeam();
    void assignTasks();
    void reportProjectStatus();
}

// ManagerProgrammer Class implementing both Programmer and Manager interfaces
class ManagerProgrammer implements Developer, ManagerDir {
    String name;
    int empId;
    String phoneNo;
    int experience;
    int teamSize;
    int projectStatus;
    List<String> programmingLanguages;

    // Constructor
    ManagerProgrammer(String name, int empId, String phoneNo, int experience, int teamSize, int projectStatus, List<String> programmingLanguages) {
        this.name = name;
        this.empId = empId;
        this.phoneNo = phoneNo;
        this.experience = experience;
        this.teamSize = teamSize;
        this.projectStatus = projectStatus;
        this.programmingLanguages = programmingLanguages;
    }

    // Implementing methods from Programmer interface
    public void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguages.get(0) + ".");
    }

    public void debugCode() {
        System.out.println(name + " is debugging code.");
    }

    public void displayProgrammingLanguages() {
        System.out.println(name + " knows the following programming languages: " + programmingLanguages);
    }

    // Implementing methods from Manager interface
    public void manageTeam() {
        System.out.println(name + " is managing a team of " + teamSize + " members.");
    }

    public void assignTasks() {
        System.out.println(name + " is assigning tasks to the team.");
    }

    public void reportProjectStatus() {
        switch (projectStatus) {
            case 1:
                System.out.println("Project is in the initial phase.");
                break;
            case 5:
                System.out.println("Project is in the intermediate phase.");
                break;
            case 10:
                System.out.println("Project is completed.");
                break;
            default:
                System.out.println("Project status is not defined.");
        }
    }

    // Additional method to display all details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Phone Number: " + phoneNo);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Team Size: " + teamSize);
        System.out.println("Programming Languages: " + programmingLanguages);
        System.out.println("Project Status: " + projectStatus);
    }
}



