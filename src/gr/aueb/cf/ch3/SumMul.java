package gr.aueb.cf.ch3;

/**
 * Calculate the sum and mul of
 * firrst 10 integers.
 */
public class SumMul {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int j = 1;
        int mul =1;

        while (i<=10) {
            sum = sum + i;
            //sum += i;
            i++;
        }

        while(j<=10){
            mul = mul + j;
            //mul *= j;
            j++;
        }
    }
}
