package Stringmethods;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CompareVersion {
    public static void main(String args []){
        System.out.println(2022503041);
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string 1");
        String str1=sc.nextLine();
        System.out.println("Enter the string 2");
        String str2=sc.nextLine();
        String[] str_arr1 = str1.split("\\.");
        String[] str_arr2 = str2.split("\\.");
//        str1=str1.replace(".","");
//        str2=str2.replace(".","");
//        for(String val: str_arr1)
//        {
//            System.out.println(val);
//        }
//        int com =str1.compareTo(str2);
//        if(com==0)
//            System.out.println("Both String is equal");
//        else if(com<0)
//                System.out.println("String 1 is lesser");
//        else
//                System.out.println("String 1 is greater");
//        System.out.println(str1);
//        System.out.println(str2);
        for(int i=0;i<str_arr1.length;i++)
        {
            int com =str_arr1[i].compareTo(str_arr2[i]);
                    if(com==0)
                        continue;
                    else{
                        if(com<0) {
                            System.out.println("String 1 is lesser");
                            break;
                        }
                        else {
                            System.out.println("String 1 is greater");
                            break;
                        }
                    }
        }
//        if (str_arr1.length > str_arr2.length) {
//            System.out.println("String 1 is greater");
//        } else if (str_arr1.length < str_arr2.length) {
//            System.out.println("String 1 is lesser");
//        } else {
//            System.out.println("Both strings are equal");
//        }

        int maxLength = Math.max(str_arr1.length, str_arr2.length);

//        for (int i = 0; i < maxLength; i++) {
//            int num1 = (i < str_arr1.length) ? Integer.parseInt(str_arr1[i]) : 0;
//            int num2 = (i < str_arr2.length) ? Integer.parseInt(str_arr2[i]) : 0;
//
//            if (num1 > num2) {
//                System.out.println("Version 1 is greater.");
//                return;
//            } else if (num1 < num2) {
//                System.out.println("Version 2 is greater.");
//                return;
//            }
//        }

    }
}
