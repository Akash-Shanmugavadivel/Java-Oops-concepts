
import java.io.InputStreamReader;
import  java.io.BufferedReader;
import  java.io.IOException;
public class FrequencyCounter {
    public static void main(String args []) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("2022503041");
        System.out.println("Frequency Counter");
        System.out.println("Enter the string:");
        String str = reader.readLine();
        str.toLowerCase();
        System.out.println("Enter the key to search:");
        String key = reader.readLine();
        key.toLowerCase();
//        String [] words = new String[10];
        String [] words = str.split("[, ?.!-]");
        System.out.println("The frequency of the key"+key+"in the entered String "+CountFrequency(words,key));
//        for(String val:words){
//            System.out.println(val);
//        }
    }
    public static int CountFrequency(String [] words,String key){
        int countKey=0;
        for(String val:words){
            if(val.equals(key)||val.contains(key)) countKey++;
        }
        return countKey;
    }

}
