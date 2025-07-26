package StringFunLab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Pangram {
    String str;

    Pangram(String str){
        this.str = str;
    }

    public static void main(String args []) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String str1 = reader.readLine();
        str1.toLowerCase();
        Pangram p = new Pangram(str1);
        p.CheckPangram(p.str);}
    void CheckPangram(String Str){
        HashSet<Character> set =new HashSet();
        for(char ch ='a';ch<='z';ch++)
            set.add(ch);
        for(char val : str.toCharArray()){
            if(set.contains(val))
            {
                set.remove(val);
            }
        }
        if(set.isEmpty())
            System.out.println("the string is anagram");
        else{
            System.out.println("the string is not anagram! Missing letters are");
            System.out.println(set);}
    }
}
