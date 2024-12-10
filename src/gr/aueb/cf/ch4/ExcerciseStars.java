package gr.aueb.cf.ch4;

import java.util.Scanner;

public class ExcerciseStars {

    public static void main(String[] args) {
        int stars = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the stars");
        stars = scanner.nextInt();

//        for (int i = 1;  i <= stars ; i++){
//             System.out.print("*");
//
//        for (int i = 1; i <= stars; i++) {
//            System.out.println("*");
//        }
//        for (int i = 1; i <= stars; i++) {
//            for (int j = 1; j <= stars; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= stars; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= stars; i++) {
            for (int j = stars; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

