package inheritance;

public class CEO extends Manager{
    int No_man;

    CEO(String Name,int Emp_id,String PhoneNo,int Exp,int team_s,int NoMan){
        super(Name,Emp_id,PhoneNo,Exp,team_s);
        this.No_man=NoMan;
        System.out.println("CEO with no project");
    }
    CEO(String Name,int Emp_id,String PhoneNo,int Exp,int team_s,int Status,int NoMan){
        super(Name,Emp_id,PhoneNo,Exp,team_s,Status);
        this.No_man=NoMan;
        System.out.println("CEO with  project");
    }
    void printCEO(){
        System.out.println("CEO");
        System.out.println(this.Name);
        System.out.println(this.Emp_id);
        System.out.println(this.PhoneNo);
        System.out.println(this.Exp);
        System.out.println(this.teamSize);
        System.out.println(this.projectStatus);
        System.out.println(this.No_man);
    }

}
