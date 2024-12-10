package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηλικίες  >18.
 * Ελέγχει αν μία ηλικία έχει δικαίβμα
 * να ψηφίσει
 */
public class VoteEligible {

    public static void main(String[] args) {
        final int VOTING_AGE = 18;
        int age = 0;
        boolean isEligible = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert your age");
        age = scanner.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.println("You are  eligible:" +  isEligible);


    }
}
