/*
 * https://projecteuler.net/problem=25
 */

package Java;

import java.math.BigInteger;

public class ID025 {

    public static void main(String[] args) {
        System.out.println(calc(1000));
    }

    // returns index of first fibonacci number with at least X digits
    public static Integer calc(Integer digits) {
        BigInteger f0 = BigInteger.ZERO;
        BigInteger f1 = BigInteger.ONE;

        for (int counter = 1;; counter++) {
            if (f1.toString().length() >= 1000) {
                return counter;
            }

            BigInteger temp = f0.add(f1);
            f0 = f1;
            f1 = temp;
        }
    }
}