package StringProgram;
import java.io.InputStreamReader;
import  java.io.BufferedReader;
import  java.io.IOException;

public class Compression {
    public static void main(String args []) throws IOException {
        System.out.println(2022503041);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String str1 = reader.readLine();
//        StringBuilder str2 = new StringBuilder();

        String str2 ="";
        int i;
        int count = 1;
        for (i = 1; i < str1.length(); i++) {
            if (str1.charAt(i) != str1.charAt(i - 1)) {
                str2 += str1.charAt(i - 1) + "" + count;
//                    str2.append(str1.charAt(i - 1)).append(count);
                    count = 1;
//                System.out.print(str1.charAt(i - 1)+""+count);
//                count = 1;
                } else
                    count++;

            }
//        System.out.print(str1.charAt(i - 1)+""+count);
//            str2.append(str1.charAt(str1.length() - 1)).append(count);
        str2 += str1.charAt(i - 1) + "" + count;
        if (str2.length() >= str1.length()) {
            System.out.println("Original String: " + str1);
        } else {
            System.out.println("Compressed String: " + str2);
        }
        }
    }
