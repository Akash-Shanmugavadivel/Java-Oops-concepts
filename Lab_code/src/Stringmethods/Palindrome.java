package Stringmethods;

import java.io.InputStreamReader;
import  java.io.BufferedReader;
import  java.io.IOException;
public class Palindrome {
    public static void main(String [] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("2022503041");
        System.out.println("Check Palindrome");
        System.out.println("Enter the string:");
        String str1 = reader.readLine();
        str1.toLowerCase();
        if(CheckPalindrome(str1)) System.out.println(str1+" -- true");
        else System.out.println(str1+" -- false");
    }
    public static boolean CheckPalindrome(String str1){
        int left=0,right=str1.length()-1;
        while(left<=right)
        {
            if(str1.charAt(left)!=str1.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
