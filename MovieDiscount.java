/*
 * Programmer:Liam Robinson
 * Date: Oct 7th 2020
 * Purpose:
 */

import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for the side lengths
        System.err.print("How old are you? ");
        int age = input.nextInt();

        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        // TODO: Read in a true/false value
        boolean trueOrfalse = input.nextBoolean();
        
        if (trueOrfalse == true) {
        	
        	System.out.println("You have access to a discount!");
        	
        	
        }

        // Print the cost of a movie ticket
        // TODO: Figure out the cost and print it
    }
}
