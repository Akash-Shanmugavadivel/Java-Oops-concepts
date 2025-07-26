package Exception_Ex;

import java.io.IOException;

public class OverRideEx {
    public static void main(String[] args) throws IOException {
        OverRideEx or=new OverRideEx();
        try{
            or.CheckArgumentValid(-1);
        }catch (IOException e){
            System.out.println("Error:"+e.getMessage());
        }
        try{
            or.CheckArgumentValid(null);
        }catch(NullPointerException e){
            System.out.println("Error:"+e.getMessage());
        }
        try{
            or.CheckArgumentValid(4,2);
        }catch(NegativeArraySizeException e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        try {
            or.CheckArgumentValid(9);
            or.CheckArgumentValid("akash");
            int arr[] = or.CheckArgumentValid(5, 4);
            System.out.println(arr);
        }
        catch (IOException e){
            System.out.println("Exception is Catched");
        }
    }

    public void CheckArgumentValid(String s) throws NullPointerException{
        if(s==null)
            throw new NullPointerException("String can't be NULL");

        System.out.println("The Argument value is "+s);

    }
    public void CheckArgumentValid(int a) throws IOException {
        if(a<0)
            throw new IOException("Integer value is not less than ZERO");

        System.out.println("The Argument value is "+a);
    }
    public int [] CheckArgumentValid(int size,int pos) throws NegativeArraySizeException,ArrayIndexOutOfBoundsException {
        if(size<0) {
            throw new NegativeArraySizeException("Array size can't be Negative");
        }

        System.out.println("New Array is created");
        int arr[]=new int[size];
        try{
            System.out.println("the element is "+arr[pos]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            throw new ArrayIndexOutOfBoundsException("Tring to Access the Element grater than size");
        }
        return arr;
    }
}
