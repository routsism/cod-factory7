package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αντιστρέφει έναν ακέραιο. Για παράδειγμα
 * το 123 γίνεται 321.
 */
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int reversed = 0;
        int digit = 0;

        System.out.println("Enter a positive integer");
        num = scanner.nextInt();

        while (num != 0){
            digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("The reversed number is: " +reversed);
    }
}
