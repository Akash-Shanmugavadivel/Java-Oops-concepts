package Stringmethods;
import java.io.InputStreamReader;
import  java.io.BufferedReader;
import  java.io.IOException;
import java.util.Arrays;

public class Anagram {
    public static void main(String args []) throws IOException {
        System.out.println(2022503041);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string 1:");
        String str1 = reader.readLine();
        System.out.println("Enter the string 2:");
        String str2 = reader.readLine();
        str1=str1.toUpperCase().replace(" ","");
        str2=str2.toUpperCase().replace(" ","");
        int countstr[] = new int [26];
        if(str1.length()!=str2.length())
            System.out.println("the string is anagram false");
        for(int i=0;i<str1.length();i++){
            countstr[str1.codePointAt(i)-65]++;
        }
        for(int i=0;i<str1.length();i++){
            countstr[str1.codePointAt(i)-65]--;
        }
        System.out.println("the string is anagram "+Arrays.stream(countstr).allMatch(value -> value == 0));
    }

}
