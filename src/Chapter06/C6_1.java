package Chapter06;

import java.util.Scanner;

/**
 * Program to determine whether the input is a valid password
 *
 * @author Gregory Sage
 */
public class C6_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = input.next();

        System.out.println(isValid(password) ? "Valid Password" : "Invalid Password");
    }

    /**
     * Password checker
     *
     * @param password user's password
     * @return true or false password
     */
    public static boolean isValid(String password) {
        // Atleast 8 characters
        if (password.length() < 8) {
            System.out.println("A password must have at least eight characters");
            return false;
        }

        // Only letters and digits
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                System.out.println("A password must consist of only letters and digits");
                return false;
            }
        }

        // Atleast 2 digits
        int digits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i))) {
                ++digits;
            }
        }
        if (digits < 2) {
            System.out.println("A password must contain at least two digits");
            return false;
        }

        // If all conditions are met
        return true;
    }
}
