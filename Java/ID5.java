/* 
 * https://projecteuler.net/problem=5
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
                    check++;
                } else {
                    check = 0;
                    break;
                }
            }

            if (check.equals(limit)) {
                return number;
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

        for (long i = 2; i <= limit; i++) {
            lcm = calcLCM(i, lcm);
        }

        return lcm;
    }

    private static Long calcLCM(Long x, Long y) {
        return x * y / BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).longValue();
    }
}