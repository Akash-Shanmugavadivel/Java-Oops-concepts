package Exception_Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExceptionExamples {

    public static void main(String[] args) {
        arrayIndexOutOfBoundsExample();
//        arrayStoreExceptionExample();
//        classCastExceptionExample();
//        illegalArgumentExceptionExample();
//        indexOutOfBoundsExceptionExample();
//        negativeArraySizeExceptionExample();
//        nullPointerExceptionExample();
//        numberFormatExceptionExample();
//        stringIndexOutOfBoundsExceptionExample();
//        unsupportedOperationExceptionExample();
    }

    // 1. ArrayIndexOutOfBoundsException Example
    public static void arrayIndexOutOfBoundsExample() {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);  // Out of bounds access
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        finally {
            arrayStoreExceptionExample();
        }
    }

    // 2. ArrayStoreException Example
    public static void arrayStoreExceptionExample() {
        try {
            Object[] array = new String[3];
            array[0] = 100;  // Invalid assignment
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException: " + e.getMessage());
        }
        finally {
            classCastExceptionExample();
        }
    }

    // 3. ClassCastException Example
    public static void classCastExceptionExample() {
        try {
            Object obj = new Integer(42);
            String str = (String) obj;  // Invalid casting
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }finally {
            illegalArgumentExceptionExample();
        }
    }

    // 4. IllegalArgumentException Example
    public static void illegalArgumentExceptionExample() {
        try {
            setAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
        finally {
            indexOutOfBoundsExceptionExample();
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // 5. IndexOutOfBoundsException Example
    public static void indexOutOfBoundsExceptionExample() {
        List<String> list = new ArrayList<>();
        list.add("One");
        try {
            System.out.println(list.get(1));  // Out of bounds
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        }
        finally {
            negativeArraySizeExceptionExample();
        }
    }

    // 6. NegativeArraySizeException Example
    public static void negativeArraySizeExceptionExample() {
        try {
            int[] arr = new int[-5];  // Invalid array size
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException: " + e.getMessage());
        }
        finally {
            nullPointerExceptionExample();
        }
    }

    // 7. NullPointerException Example
    public static void nullPointerExceptionExample() {
        String str = null;
        try {
            System.out.println(str.length());  // Null reference
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
        finally {
            numberFormatExceptionExample();
        }
    }

    // 8. NumberFormatException Example
    public static void numberFormatExceptionExample() {
        String number = "abc";
        try {
            int result = Integer.parseInt(number);  // Invalid number format
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
        finally {
            stringIndexOutOfBoundsExceptionExample();
        }
    }

    // 9. StringIndexOutOfBoundsException Example
    public static void stringIndexOutOfBoundsExceptionExample() {
        String str = "Hello";
        try {
            System.out.println(str.charAt(5));  // Invalid string index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }
        finally {
            unsupportedOperationExceptionExample();
        }
    }

    // 10. UnsupportedOperationException Example
    public static void unsupportedOperationExceptionExample() {
        List<String> list = Arrays.asList("One", "Two", "Three");
        try {
            list.add("Four");  // Immutable list operation
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException: " + e.getMessage());
        }
    }
}
