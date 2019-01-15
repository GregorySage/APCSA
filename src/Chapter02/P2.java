package Chapter02;

import java.util.Scanner;

/**
 * Program to calculate price of dinner
 *
 * @author Gregory Sage
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter price of meal:");
        double meal = input.nextDouble();

        System.out.println("Enter price of drink:");
        double drink = input.nextDouble();

        System.out.println("Enter price of dessert:");
        double dessert = input.nextDouble();

        double total = meal + drink + dessert;
        System.out.print("Price of food: ");
        System.out.println(total);

        double tax = total * .10;
        System.out.print("Sales tax: ");
        System.out.println(tax);

        double tip = (total + tax) * .15;
        System.out.print("Tip: ");
        System.out.println(tip);

        double cost = total + tax + tip;
        System.out.print("Total cost: ");
        System.out.println(cost);
    }
}
