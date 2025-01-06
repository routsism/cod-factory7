package gr.aueb.cf.projects;

import java.io.*;
import java.util.*;

public class project3 {

    public static void main(String[] args) {

        String filename = "c:/input.txt";


        char[][] freqTable = new char[128][2];


        for (int i = 0; i < 128; i++) {
            freqTable[i][0] = 0;
            freqTable[i][1] = 0;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (Character.isWhitespace(ch)) {
                    continue;
                }


                if (freqTable[ch][0] == 0) {
                    freqTable[ch][0] = (char) ch;
                }


                freqTable[ch][1]++;
            }
        } catch (IOException e) {
            System.out.println("Σφάλμα κατά την ανάγνωση του αρχείου: " + e.getMessage());
        }


        System.out.println("Στατιστικά ταξινομημένα ανά χαρακτήρα:");
        Arrays.stream(freqTable)
                .filter(entry -> entry[0] != 0)
                .sorted((a, b) -> Character.compare(a[0], b[0]))
                .forEach(entry -> System.out.println(entry[0] + ": " + entry[1]));

        System.out.println("\nΣτατιστικά ταξινομημένα ανά συχνότητα εμφάνισης:");
        Arrays.stream(freqTable)
                .filter(entry -> entry[0] != 0)
                .sorted((a, b) -> Integer.compare(b[1], a[1]))
                .forEach(entry -> System.out.println(entry[0] + ": " + entry[1]));
    }
}

