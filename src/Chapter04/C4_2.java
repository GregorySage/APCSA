package Chapter04;

import java.util.Scanner;

/**
 * Program to determine if a string contains a sub string
 *
 * @author Gregory Sage
 */
public class C4_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = input.next();
        System.out.print("Enter string s2: ");
        String s2 = input.next();

        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
