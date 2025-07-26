package Exception_Ex;
// Base class
class Base {
    public void methodThrowingUnchecked() {
        throw new RuntimeException("Unchecked Exception from Base class");
    }
    public void methodThrowingChecked() throws Exception {
        throw new Exception("Checked Exception from Base class");
    }
}

class Derived extends Base {
    @Override
    public void methodThrowingUnchecked() {
        try {
            super.methodThrowingUnchecked(); // Calls base class method
        } catch (RuntimeException e) {
            System.out.println("Caught in Derived: " + e.getMessage());
        }
    }

    @Override
    public void methodThrowingChecked() {
        try {
            super.methodThrowingChecked();
        } catch (Exception e) {
            System.out.println("Caught in Derived: " + e.getMessage());
        }
    }
}

public class SuperSubClassEx {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.methodThrowingUnchecked();
        try {
            derived.methodThrowingChecked();
        } catch (Exception e) {
            System.out.println("Handled Checked Exception in Main class: " + e.getMessage());
        }
    }
}