package gr.aueb.cf.projects;

public class TheaterBooking {

    private boolean[][] theater = new boolean[30][12];


    public void book(char column, int row) {

        int colIndex = column - 'A';


        if (theater[row - 1][colIndex]) {
            System.out.println("Η θέση " + column + row + " είναι ήδη κρατημένη.");
        } else {
            theater[row - 1][colIndex] = true;
            System.out.println("Η θέση " + column + row + " κρατήθηκε επιτυχώς.");
        }
    }


    public void cancel(char column, int row) {
        int colIndex = column - 'A';


        if (!theater[row - 1][colIndex]) {
            System.out.println("Η θέση " + column + row + " δεν είναι κρατημένη.");
        } else {
            theater[row - 1][colIndex] = false;
            System.out.println("Η κράτηση για τη θέση " + column + row + " ακυρώθηκε επιτυχώς.");
        }
    }


    public void printStatus() {
        System.out.println("Τρέχουσα κατάσταση του θεάτρου:");
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 12; j++) {
                if (theater[i][j]) {
                    System.out.print("[X] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        TheaterBooking theaterBooking = new TheaterBooking();

        // Δοκιμαστική κράτηση θέσεων
        theaterBooking.book('A', 1);
        theaterBooking.book('A', 1); // Δοκιμή για κράτηση ήδη κρατημένης θέσης
        theaterBooking.book('B', 2);

        // Εκτύπωση της κατάστασης του θεάτρου
        theaterBooking.printStatus();

        // Δοκιμαστική ακύρωση
        theaterBooking.cancel('A', 1);
        theaterBooking.cancel('A', 1); // Δοκιμή για ακύρωση μη κρατημένης θέσης

        // Εκτύπωση της κατάστασης του θεάτρου
        theaterBooking.printStatus();
    }
}


