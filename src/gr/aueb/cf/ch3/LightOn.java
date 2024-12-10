package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn light on , if it is raining
 * AND car is running (>100) OR is dark.
 */
public class LightOn {

    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isRunning = false;
        boolean isDark = false;
        boolean areLightsOn = false;
        int carSpeed;
        final int MAX_CAR_SPEED = 100;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed ");
        carSpeed = in.nextInt();

        isRunning = carSpeed > MAX_CAR_SPEED ;
        areLightsOn = isRaining && (isRunning || isDark) ;

        System.out.println("Turn Lights on:" + areLightsOn);


    }
}
