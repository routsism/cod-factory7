package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβάνει ωσ input από τον χρήστη ένα
 * διψήφιο ακέραιο και να υπολογίζει και να
 * εκτυπώνει το άθροισμα των ψηφίων του.
 * Για παράδειγμα , αν ο χρήστης δώσει τον
 * ακέραιο 15 , θα πρέπει το αποτέλεσμα να είναι
 * 1 + 5 = 6
 */
public class DigitsSum {

    public static void main(String[] args) {
        int num;
        int leftDigit = 0;
        int rightDigit = 0;
        int digitsSum;
        Scanner in = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε έναν αριθμό");
        num = in.nextInt();

        leftDigit = num / 10 ;
        rightDigit = num % 10 ;

        digitsSum = leftDigit + rightDigit ;

        System.out.printf("Το άθροισμα των ψηφίων είναι: %d + %d = %d " ,leftDigit, rightDigit, digitsSum);


    }
}
