package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuAskisi {

    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Επεξεργασία");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Προβολή");
            System.out.println("5. Έξοδος");
            System.out.println("Εισάγετε την επιλογή σας (1-5):");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (choice == 5) {
                System.out.println("Επιλέξατε Έξοδο");
            } else {
                System.out.println("Μη έγκυρη επιλογή! Παρακαλώ επιλέξτε έναν αριθμό μεταξύ του 1 και 5");
            }
        } while (choice != 5);
    }
}
