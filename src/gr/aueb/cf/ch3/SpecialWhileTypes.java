package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Special forms of while
 */
public class SpecialWhileTypes {

    public static void main(String[] args) {
        int i = 1;
        int num ;
        Scanner in = new Scanner(System.in);

        while ((num = in.nextInt()) >=0);
        //σαν να τους αγνοεί γιατί δεν έχει σώμα
        // όταν θα διαβάσει αρνητικό θα βγει

        while (i<=0){
            System.out.println("Never gets in");
            i++;
        }

        while (i<1){
            System.out.println("Never gets in");
        }

        while (i<=1){
            System.out.println("One time gets in");
            i++;
        }

        while (true){
            System.out.println("Eternal loop");

        }
    }
}
