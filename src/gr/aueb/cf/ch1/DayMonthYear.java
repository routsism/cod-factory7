package gr.aueb.cf.ch1;

import java.util.Scanner;

public class DayMonthYear {
    public static void main(String[] args) {
        int inputDay;
        int inputMonth;
        int inputYear;

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert one num for day");
        inputDay = in.nextInt();
        System.out.println("Please insert one num for month");
        inputMonth = in.nextInt();
        System.out.println("Please insert one num for year");
        inputYear = in.nextInt();

        System.out.printf("Η ημερομηνία είναι %02d/%02d/%d", inputDay,inputMonth,inputYear);
    }
}
