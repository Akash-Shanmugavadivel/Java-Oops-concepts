package Stringmethods;
import java.util.Scanner;

public class ValidEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email:");
        String email = sc.nextLine();

        if (isValidEmail(email)) {

            String username = email.substring(0, email.indexOf('@'));
            String domain = email.substring(email.indexOf('@') + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("Not valid");
        }
    }

    // Method to check if email is valid
    private static boolean isValidEmail(String email) {

        int atIndex = email.indexOf('@');
        if (atIndex == -1 || email.indexOf('@', atIndex + 1) != -1) {
            return false;
        }

        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);

        if (username.length() > 25 || !username.matches("[0-9a-zA-Z_\\-\\+]+")) {
            return false;
        }

        if (!(domain.endsWith(".com") || domain.endsWith(".in") || domain.endsWith(".edu"))) {
            return false;
        }

        return true;
    }
}
