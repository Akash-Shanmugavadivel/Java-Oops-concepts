package Stringmethods;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class StringMethods {
    public static void main(String args[]){
        System.out.println(2022503041);
        String s1="Welcome to Java"; //this is created in stack memory
        String s2=s1;//make a reference of s1
        String s3=new String("Welcome to Java"); //this is created in heap memory
//        List<Integer>=new ArrayList<>(5);
//        //System.out.println(
         System.out.println(s1 == s2);//checks reference address
        System.out.println(s2 == s3);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equals(s3));//checks the value
        System.out.println(s1.compareTo(s2)); //equal 0,less than -1 , greater than 1
        System.out.println(s2.compareTo(s3));
        System.out.println(s1.equals(s2));
        String s4=s1.intern(); // to create the s1 in string pool
        System.out.println(s2 == s4); //intern()
        System.out.println("s3 ==s4 " + (s3 == s4));
        System.out.println(s1 +" "+ s2); //concadination
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf('j'));//not present -1 ,present return index
        System.out.println(s1.indexOf("to")); //starting index
        System.out.println(s1.lastIndexOf('a')); //last occurence of a, not present -1
        System.out.println(s1.lastIndexOf("o", 7)); //giving the last index s1.size();
        System.out.println(s1.codePointCount(0, s1.length()));
        System.out.println(s1.length());//length


        System.out.println(s1.substring(3));
        System.out.println(s1.substring(1,3));
        System.out.println(s1.startsWith("Wel"));


    }
}
