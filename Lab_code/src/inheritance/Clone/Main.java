package inheritance.Clone;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> pro_lang = new ArrayList<>();
        pro_lang.add("C");

        Programmer originalProgrammer = new Programmer("Rathan", 3, "5678901234", 5, pro_lang);
        System.out.println("Original Programmer:");
        originalProgrammer.printProgrammer();
        System.out.println();

        // Shallow Clone
        Programmer shallowClone = (Programmer) originalProgrammer.clone();
        shallowClone.pro_lang.add("Python");
        shallowClone.Name="akash";
        System.out.println("Shallow Cloning:");
        System.out.println("Shallow Clone:");
        shallowClone.printProgrammer();
        System.out.println("Original Programmer after modifying shallow clone:");
        originalProgrammer.printProgrammer();  // The original object is not affected by changes in shallow clone
        System.out.println();

        // Deep Clone
        Programmer deepClone = originalProgrammer.deepClone();
        deepClone.pro_lang.add("HTML");
        System.out.println("Deep Cloning:");
        System.out.println("Deep Clone:");
        deepClone.printProgrammer();
        System.out.println("Original Programmer after modifying deep clone:");
        originalProgrammer.printProgrammer();  // The original object is unaffected by changes in deep clone
    }
}
