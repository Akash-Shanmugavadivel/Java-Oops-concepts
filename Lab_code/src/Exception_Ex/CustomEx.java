package Exception_Ex;

public class CustomEx {
    public static void CheckAge(int age) throws Exception{
        if(age<18)
        {
            throw new Exception("Age must be 18 or older");
        }
        else{
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) {
        int age =15;
        try{
            CheckAge(age);
        }catch (Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
}
