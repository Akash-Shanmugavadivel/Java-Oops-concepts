/*
package Files;
import java.io.*;

public class filesmethods {
    public static String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + shift) % 26 + base);  // Shift within alphabet
            }
            encrypted.append(c);
        }
        return encrypted.toString();
    }
    public static void BufferIO() throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("Z:\\Learn java\\src\\Files\\SampleSrc.txt"));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("Z:\\Learn java\\src\\Files\\SampleDesc.txt"));
        int c;
        while ((c = in.read()) != -1)
        {
            out.write(c);
        }
        in.close();
        out.close();
    }
    public static void InputSR(char a) throws IOException {
        InputStreamReader in = new InputStreamReader(new FileInputStream("Z:\\Learn java\\src\\Files\\SampleSrc.txt"));
        int c;
        int count=0;
        while ((c = in.read()) != -1)
        {
          if(c==a)count++;
        }
        System.out.println("Number occurrence of "+a+" :"+count);
        in.close();

    }
    public static void BufferRW() throws IOException{
        BufferedReader re = new BufferedReader(new FileReader("Z:\\Learn java\\src\\Files\\SampleSrc.txt"));
        BufferedWriter wr = new BufferedWriter(new FileWriter("Z:\\Learn java\\src\\Files\\SampleDesc.txt"));
        String s;
        int count=0;
        int shift = 3;
        while ((s = re.readLine()) != null) {
            wr.write(s);
            wr.write("\n");

            String []words = s.split(" ");

            for(int i=0;i<words.length;i++){
                //Palindrome Palindrome = new Palindrome(words[i]);


if(Palindrome.CheckPalindrome()){
                    count++;
                    System.out.println(Palindrome.str1);
                }
            }
            String encryptedLine = encrypt(s, shift);
            wr.write("\nEncrypted:\n");
            wr.write(encryptedLine);
            wr.write("\n");

        }
        wr.write("\nNumber of palindrome: "+count);
        wr.close();
        re.close();
    }

    public static void main(String[] args) throws IOException {
        long endTime,startTime;
//        startTime = System.currentTimeMillis();
//        BufferRW();
//         endTime = System.currentTimeMillis();
//        System.out.println("BufferRW :"+(endTime-startTime));
//        startTime = System.currentTimeMillis();
//        BufferIO();
//        endTime = System.currentTimeMillis();
//        System.out.println("BufferIO :"+(endTime-startTime));
        startTime = System.currentTimeMillis();
        InputSR('a');
        endTime = System.currentTimeMillis();
        System.out.println("BufferIO :"+(endTime-startTime));
    }

}
*/
