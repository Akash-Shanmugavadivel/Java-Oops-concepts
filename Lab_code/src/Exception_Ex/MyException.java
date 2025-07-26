package Exception_Ex;
class
MyException extends Exception {
    private int age;
    MyException(int age) {
        super("not less than 18");
        this.age = age;
    }
//    public String toString() {
//        return "Exception[" + age + "]";
//    }
    public int getAge(){
        return age;
    }
}
class CustomException {
    static void checkAge(int age) throws
            MyException{
        System.out.println("Called checkAge(" + age + ")");
        if (age <18)
            throw new
                    MyException(age);
        else
            System.out.println("you are eligible to vote");
        System.out.println("Normal exit");     }
    public static void main(String args[]) {
        try {
            checkAge(18);
            checkAge(15);
        } catch (
                MyException e) {
            System.out.println("Exception Caught " + e.getMessage());
        }
    } }