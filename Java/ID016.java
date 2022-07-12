/*
 * https://projecteuler.net/problem=16
 */

package Java;

import java.math.BigInteger;

public class ID016 {

    public static void main(String[] args) {
        System.out.println(calcSumOfDigits(new BigInteger("2").pow(15)));
        System.out.println(calcSumOfDigits(new BigInteger("2").pow(1000)));
    }

    public static Integer calcSumOfDigits(BigInteger number) {
        Integer sum = 0;

        for (char c : number.toString().toCharArray()) {
            sum += c - '0';
        }

        return sum;
    }
}