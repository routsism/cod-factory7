package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert years (ages) to days.
 */
public class YearsToDays {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        int inputAge;
        int days;
        final int DAYS_PER_YEAR = 365 ;
        Scanner in = new Scanner(System.in);

        //  Εντολές
        System.out.println("Please insert your age");
        inputAge = in.nextInt();

        days = inputAge * DAYS_PER_YEAR ;


        //Εκτύπωση των αποτελεσμάτων
        System.out.printf( "Τα %d years είναι  %,d days",inputAge ,days);
    }

}
