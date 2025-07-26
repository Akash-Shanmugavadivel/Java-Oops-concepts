package Files;
import java.io.*;

public class CopyFiles {
    public static void ByteStreamCopy() throws IOException {
        byte[] buffer = new byte[1024];
        FileInputStream in = new FileInputStream("Z:\\Learn java\\src\\Files\\SampleSrc.txt");
        FileOutputStream out = new FileOutputStream("Z:\\Learn java\\src\\Files\\SampleDesc.txt");
        int c;
        while ((c = in.read(buffer)) != -1) {
            out.write(buffer, 0, c);
        }
        out.write("\nbyte stream".getBytes());
        in.close();
        out.close();
    }
    public static void CharStreamCopy() throws IOException {
        char[] buffer = new char[1024];
        FileReader in = new FileReader("Z:\\Learn java\\src\\Files\\SampleSrc.txt");
        FileWriter out = new FileWriter("Z:\\Learn java\\src\\Files\\SampleDesc.txt");
        int c;
        int count = 0;
        boolean newLine=true;
        while ((c = in.read(buffer)) != -1) {
            out.write(buffer, 0, c);
            for (int i = 0; i < c; i++) {
                if (buffer[i] == '\n') {
                    count++;
                    newLine=false;
                }

            }
        }
        out.write("\nchar stream");
        System.out.println(count);
        out.write("\nLine count "+count);
        in.close();
        out.close();
    }
    public static void main(String [] args) throws IOException {
        CharStreamCopy();

    }

}
