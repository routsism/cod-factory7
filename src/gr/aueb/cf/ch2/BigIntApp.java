package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo.
 */
public class BigIntApp {
    public  static void main(String[] args){

        BigInteger bigNum1 = new BigInteger("123456789987654321");
        BigInteger bigNum2 = new BigInteger("234567896555555588");
        BigInteger result;

        result = bigNum1.add(bigNum2);

        System.out.printf("%,d" , result);
    }
}
