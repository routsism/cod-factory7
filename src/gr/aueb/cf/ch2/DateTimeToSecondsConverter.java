package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει ημέρες , ώρεσ , λεπτά ,δευτερόλεπτα
 * σε συνολικά δευτερόλεπτα , ο χρήστης δίνει
 * τα δεδομένα και εκτυπώνεται το αποτέλεσμα
 */

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        int days  ;
        int hours  ;
        int minutes ;
        int seconds  ;
        int totalSeconds ;
        Scanner in = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε μέρες");
        days = in.nextInt();
        System.out.println("Παρακαλώ εισάγετε ώρες");
        hours = in.nextInt();
        System.out.println("Παρακαλώ εισάγετε λεπτά");
        minutes = in.nextInt();
        System.out.println("Παρακαλώ εισάγετε δευτερόλεπτα");
        seconds = in.nextInt();

        totalSeconds = ( days * 86400)  + ( hours * 3600) + ( minutes * 60)+ seconds ;

        System.out.printf("Το σύνολο του χρόνου σε δευτερόλεπτα είναι %,d seconds\n" , totalSeconds);

    }
}

