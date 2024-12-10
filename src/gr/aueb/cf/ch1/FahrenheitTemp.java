package gr.aueb.cf.ch1;

import java.util.Scanner;

public class FahrenheitTemp {
    public static void main(String[] args){
        int inputTemp;
        int tempKelsious;

        Scanner in = new Scanner(System.in);



         System.out.println("Please insert the Temp");
         inputTemp=in.nextInt();
         tempKelsious = 5*(inputTemp - 32)/9;
         System.out.printf("Η %d θερμοκρασία σε Fahrenheit είναι %d σε Κελσίου" , inputTemp ,tempKelsious);


    }
}
