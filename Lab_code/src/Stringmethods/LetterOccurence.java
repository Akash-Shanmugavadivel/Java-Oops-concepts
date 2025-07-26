package StringProgram;
import java.io.InputStreamReader;
import  java.io.BufferedReader;
import  java.io.IOException;
public class LetterOccurence {

    public static void main(String args []) throws IOException{
        System.out.println(2022503041);
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String str1 = reader.readLine();
        str1.toLowerCase();
        //String str2 = new String(str1);

        int countOcc [] = new int[26];
        char[] charArray = str1.toCharArray();
        for(char val : charArray){
            countOcc[val-'a']++;
        }
        for(int i=0;i<26;i++){
            if(countOcc[i]==0)
                continue;
            else
             System.out.println(((char)(i+65))+" "+countOcc[i]);
        }



    }

}
