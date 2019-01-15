package Chapter02;

import java.util.Scanner;

/**
 * Program to calculate intrest
 *
 * @author Gregory Sage
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter balance:");
        double balance = input.nextDouble();

        System.out.println("Enter intrest rate:");
        double intrest = input.nextDouble();

        System.out.println(balance * (intrest / 1200));
    }
}
