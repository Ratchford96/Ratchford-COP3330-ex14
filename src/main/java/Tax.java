/*
 * UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Joseph Ratchford
 */
import java.util.Scanner;
public class Tax {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // declare the variables;
        double tax;
        int amount;
        double finalTotal;

        // User enters the total amount
        System.out.print(" What is the order amount? ");
        amount = scan.nextInt();
        // The user enter the state the tax is in
        System.out.println(" What is the state? ");
        String state = scan.nextLine();
        String out = state;
        System.out.println(out);

        // These functions do our math for solving

        System.out.println(" The subtotal is " + amount );
        tax = 0.055;
        System.out.println(" The tax is " + tax);
        finalTotal = amount + tax;

        System.out.println(" The total is " + finalTotal);


    }

}
