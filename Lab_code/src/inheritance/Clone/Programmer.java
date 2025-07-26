package inheritance.Clone;

import java.util.ArrayList;
import java.util.List;

class Programmer implements Cloneable {
    String Name;
    int Emp_id;
    String PhoneNo;
    int Exp;
    List<String> pro_lang;

    Programmer(String Name, int Emp_id, String PhoneNo, int Exp, List<String> pro_lang) {
        this.Name = Name;
        this.Emp_id = Emp_id;
        this.PhoneNo = PhoneNo;
        this.Exp = Exp;
        this.pro_lang = pro_lang;
    }

    // Shallow Clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep Clone
    protected Programmer deepClone() {
        List<String> newLangList = new ArrayList<>(this.pro_lang); // Deep copy of pro_lang
        return new Programmer(this.Name, this.Emp_id, this.PhoneNo, this.Exp, newLangList);
    }

    void printProgrammer() {
//        System.out.println("Programmer");
        System.out.println("Name: " + this.Name);
        System.out.println("Emp_id: " + this.Emp_id);
//        System.out.println("PhoneNo: " + this.PhoneNo);
//        System.out.println("Experience: " + this.Exp + " years");
        System.out.println("Programming Languages: " + this.pro_lang);
    }
}


