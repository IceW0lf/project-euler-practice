/*
 * https://projecteuler.net/problem=14
 */

package Java;

import java.math.BigInteger;

public class ID014 {
    
    public static void main(String[] args) {
        System.out.println(calcNumberWithGreatestCollatzChainLength(1000000));
    }

    public static Integer calcNumberWithGreatestCollatzChainLength(Integer max) {
        Integer maxNumber = 1;
        Integer maxChain = 1;

        for (int i = 1; i <= max; i++) {
            BigInteger number = BigInteger.valueOf(i);
            Integer chain = 1;

            while(!number.equals(BigInteger.ONE)) {
                if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                    number = number.divide(BigInteger.TWO);
                } else {
                    number = number.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
                }

                chain++;
            }

            if (chain > maxChain) {
                maxNumber = i;
                maxChain = chain;
            }
        }

        return maxNumber;
    }

}
