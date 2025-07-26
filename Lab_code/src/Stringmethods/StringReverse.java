package StringProgram;
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class StringReverse {
    public static void main(String [] args) throws IOException {
        System.out.println(2022503041);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter the string:");
        str = reader.readLine();
        int left =0;
        int right =str.length()-1;
        char temp ;
        char[] charArray = str.toCharArray();
        while(left<right)
        {
            temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        String reversedStr =new String(charArray);
//        for(char val : charArray)
//            System.out.print(val);
        System.out.println(str);
        System.out.println(reversedStr);
        reader.close();
    }
}
