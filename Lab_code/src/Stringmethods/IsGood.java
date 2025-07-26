
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IsGood {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("2022503041");
        System.out.println("IsGood");
        System.out.println("Enter the string:");
        String str = reader.readLine();
        str = str.toLowerCase();
        if (str.contains("not") && str.contains("bad")) {
            if (str.indexOf("not") < str.indexOf("bad")) {
                ChangeIsgood(str);
            } else {
                System.out.println(str);
            }
        } else {
            System.out.println(str);
        }
    }
    public static void ChangeIsgood(String str) {
//        char[] notbad = new char[(str.indexOf("bad") + 3)-str.indexOf("not")];
//        str.getChars(str.indexOf("not"), str.indexOf("bad") + 3, notbad, 0);
//        String notbadStr = new String(notbad);
//        String changed = str.replace(notbadStr, "good");
//        System.out.println(changed);
        String words[]=str.split(" ");
        int start=-1;
        int end=-1;

        for(int i=0;i<words.length;i++)
        {
            if(words[i].equals("bad"))
            {
                end=i;
                break;
            }
            if(words[i].equals("not"))
            {
                start=i;
            }
        }
        words[start]="good";
        for(int i=start+1;i<=end;i++)
        {
            words[i]="";
        }

        StringBuilder newString = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                newString.append(word).append(" ");
            }
        }
        System.out.println(newString.toString().trim());
    }
}
