package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DisektoAskisi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year ;

        System.out.println("Give me one year");
        year =  scanner.nextInt();

        if (year % 400 == 0 ){

            System.out.println("Το " + year + " είναι δίσκετο");
        } else
            System.out.println("Το " + year + " δεν είναι δίσεκτο ");
    }
}
