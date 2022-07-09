/* 
 * https://projecteuler.net/problem=5
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

package Java;

import java.math.BigInteger;

public class ID5 {

    public static void main(String[] args) {
        // iterative solution
        System.out.println(calcLowestCommonMultiple_Iterative(10));
        System.out.println(calcLowestCommonMultiple_Iterative(20));

        // recursive solution (much faster)
        System.out.println(calcLowestCommonMultiple_Recursive(10));
        System.out.println(calcLowestCommonMultiple_Recursive(20));
    }

    public static Long calcLowestCommonMultiple_Iterative(Integer limit) {
        Long number = (long) limit;
        Integer check = 0;

        while (true) {
            for (int i = 1; i <= limit; i++) {
                if (number % i == 0) {
                    check += 1;
                } else {
                    break;
                }
            }

            if (check.equals(limit)) {
                return number;
            } else {
                check = 0;
            }

            number++;
        }
    }

    /*
     * LCM = lowest common multiple
     * GCD = greatest common divisor
     * 
     * LCM(x, y) = x * y / GCD(x, y)
     * 
     * LCM(x1, x2, ..., xn) = LCM(...(LCM(x1, x2), ...), xn)
     */
    public static Long calcLowestCommonMultiple_Recursive(Integer limit) {
        Long lcm = 1L;

        for (long i = 1; i <= limit; i++) {
            lcm = calcLCM(i, lcm);
        }

        return lcm;
    }

    private static Long calcLCM(Long x, Long y) {
        return x * y / calcGCD(x, y);
    }

    private static Long calcGCD(Long x, Long y) {
        return BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).longValue();
    }
}