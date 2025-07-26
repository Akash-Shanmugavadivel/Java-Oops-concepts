package Exception_Ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystem;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
//A        trywithoutcache();
//        trywithoutfinally();
//         trywithoutcatch();
//        trymultiplecatch();
//        trynestedtrycatch();
        trywithresources();
    }
    public static void trywithoutcache()
    {
        try {
            int[] arr = new int[-5];
        }
        finally {
            System.out.println("Try without cache does not works");
        }
    }

    public static void trywithoutfinally()
    {

        try {
            int[] arr = new int[-5];
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("works");
        }
    }

    public static void trywithoutcatch()
    {
        try {
            int[] arr = new int[-5];
        }
        finally {
            System.out.println("Try without catch does not works");
        }
    }

    public static void trymultiplecatch()
    {
        String string = "AKASH";
        try {
            // System.out.println(string.charAt(-1));
            int[] arr = new int[-5];

        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println(e);
        }

        finally {
            System.out.println("Multiple catch");
        }
    }

    public static void trynestedtrycatch()
    {
        String string = "AKASH";
        String[] array = {"A","s"};
        try {

            try {

                System.out.println(string.charAt(9));
                try {


                }
                catch (IndexOutOfBoundsException e)
                {
                    System.out.println(e);
                }
                System.out.println(array[4]);
            }
            catch (StringIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            int[] arr = new int[-5];
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Nested try cache");
        }
    }

    public static void trywithresources()
    {
        try (Scanner sc = new Scanner(new File("text.txt"))){
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }

    }
}
