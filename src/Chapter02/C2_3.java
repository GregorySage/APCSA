package Chapter02;

import java.util.Scanner;

/**
 * Program to calculate price of driving
 *
 * @author Gregory Sage
 */
public class C2_3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance:");
        double distance = input.nextDouble();

        System.out.println("Enter miles per gallon:");
        double miles = input.nextDouble();

        System.out.println("Enter price per gallon:");
        double price = input.nextDouble();

        System.out.println((distance / miles) * price);
    }
}
