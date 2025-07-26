package StringProgram;
import java.io.InputStreamReader;
import  java.io.BufferedReader;
import  java.io.IOException;
import static java.lang.Character.isDigit;

public class StringExtraction {
    public static void main(String args []) throws IOException {
        System.out.println("2022503041");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String str1 = reader.readLine();
        String str2="";
        for(int i=0;i<str1.length();i++){
            if(isDigit(str1.charAt(i)))
            {
                str2+=str1.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
