package Chapter02;


import java.util.Scanner;
/**
 * Program to receive inputs, store them into variables and then calculate them
 * in a formula
 *
 * @author Gregory Sage
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter v0:");
        double v0 = input.nextDouble();

        System.out.println("Enter v1:");
        double v1 = input.nextDouble();

        System.out.println("Enter t:");
        double t = input.nextDouble();

        System.out.println((v1 - v0) / t);
    }
}
