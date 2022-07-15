/*
 * https://projecteuler.net/problem=20
 */

package Java;

import java.math.BigInteger;

public class ID020 {
    
    public static void main(String[] args) {
        System.out.println(calcSumOfDigitsOfFactorial(10));
        System.out.println(calcSumOfDigitsOfFactorial(100));
    }

    public static Integer calcSumOfDigitsOfFactorial(Integer number) {
        BigInteger factorial = MethodCollection.factorial(number);
        Integer sum = 0;

        for (Character digit : factorial.toString().toCharArray()) {
            sum += digit - '0';
        }

        return sum;
    }
}