package Exception_Ex;

import java.io.IOException;

public class ProException {
    public static void method() throws IOException {
        System.out.println("This is method");
        method1();
    }
    public static void method1() throws IOException {
        System.out.println("This is method 1");
        method2();
    }
    public static void method2() throws IOException {
        throw new IOException("Error");
    }
    public static void main(String[] args) throws IOException {
        System.out.println("this is Before Method calling");
        try {
            method();
        } catch (IOException e) {
            System.out.println("Exception caught in main: " + e);
        }
        System.out.println("this is After Method calling");
    }
}
