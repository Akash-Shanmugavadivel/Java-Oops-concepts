package Stringmethods;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class CharCount {
    String str;
    public CharCount(String str){
        this.str = str;
    }
//    public static void main(String args[]) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        // Student information
//        System.out.println("2022503041");
//        System.out.println("CharCount");
//
//        // Input string
//        System.out.println("Enter the string:");
//        String str1 = reader.readLine();
//
//        // Create CharCount object and count characters
//        CharCount cc = new CharCount(str1);
//        cc.CountChar(cc.str);
//    }

    // Method to count and print character occurrences
    public static void CountChar(String str) {
        HashMap<Character, Integer> occ = new HashMap<>();
        // Count characters
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                continue;  // Skip spaces
            }
            if (occ.containsKey(ch)) {
                occ.put(ch, occ.get(ch) + 1);

            } else
                occ.put(ch, 1);
                // Add or update the count for each character
                //occ.put(ch, occ.getOrDefault(ch, 0) + 1);
            }

            // Print character occurrences
            for (Character key : occ.keySet()) {
                System.out.println("Character '" + key + "' occurs " + occ.get(key) + " times.");
            }
        System.out.println(occ);
        }

    }