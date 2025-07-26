package Exception_Ex;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandle {
    public static void main(String args[]){
        try{
            FileInputStream file =new  FileInputStream("sample.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found "+e.getMessage());
        }
        finally{
            System.out.println("This is always Executable");
        }
    }
}
