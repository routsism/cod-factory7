package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * 153 => 1^3 + 5^3 + 3^3
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
        int sum = 0;
        int numberOfDigits;
        int originalNum;
        int digit;

        System.out.println("Please enter a number (integer)");
        num = scanner.nextInt();
        numberOfDigits = String.valueOf(num).length();  // valueOf transforms a primitive to String
        originalNum = num;

        while (num != 0 ) {
            digit = num % 10;
            sum += (int) Math.pow(digit , numberOfDigits);
            num /= 10;
        }  if (sum == originalNum) {
            System.out.println(originalNum + " είναι αριθμός Armstrong");
        } else {
            System.out.println(originalNum + " δεν είναι αριθμός Armstrong.");
        }
    }
}