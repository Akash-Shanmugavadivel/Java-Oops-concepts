package Exception_Ex;

public class ArithmeticExceptionEx  {
public static void main(String [] args) throws Exception{
    int num1=9,num2=0;
    String str =null;

    try{
        System.out.println(str.length());
        int result =num1/num2;
        System.out.println("Result:"+result);

    }
    catch (Exception e) {
        throw new RuntimeException(e);
    }
//    catch (NullPointerException e) {
//        System.out.println("Error"+e.getMessage());
//    }
//    catch (ArithmeticException e) {
//        System.out.println("Error"+e.getMessage());
//    }
}
}
