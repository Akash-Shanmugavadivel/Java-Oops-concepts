package inheritance;
import java.lang.Object;
//Single Inheritance
public class Employee {
    String Name;
    int Emp_id;
    String PhoneNo;
    int Exp;

//    @Override
//    protected void finalize () throws Throwable{
//        try{
//            System.out.println("Inside the Employee");
//        }
//        catch(Throwable e)
//        {
//            throw e;
//        }
//        finally {
//            System.out.println("Calling finalize method of Employee");
//        }
//    }

    Employee(String Name,int Emp_id,String PhoneNo){
        System.out.println("Fresher Employee");
        this.Name= Name;
        this.Emp_id=Emp_id;
        this.PhoneNo=PhoneNo;
        this.Exp=0;
    }
    Employee(String Name,int Emp_id,String PhoneNo,int Exp){
        System.out.println("Experienced Employee");
        this.Name= Name;
        this.Emp_id=Emp_id;
        this.PhoneNo=PhoneNo;
        this.Exp=Exp;
    }

    public Employee() {

    }

    void printEmployee(){
        System.out.println("Employee : ");
        System.out.println("Programmer");
        System.out.println("Name: "+this.Name);
        System.out.println("Employee Id: "+this.Emp_id);
        System.out.println("Phone No: "+this.PhoneNo);
        if(this.Exp==0)
            System.out.println("Fresher Employee");
        else
            System.out.println(this.Exp+" years of Experiance");
    }



}
