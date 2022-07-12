/*
 * collection of utility methods
 */

package Java;

import java.math.BigInteger;

public class MethodCollection {

    public static Boolean primeCheck(Integer primeCandidate) {
        Integer flooredSqrt = flooredSqrtOf(primeCandidate);

        if (primeCandidate == 2) {
            return true;
        }

        if (primeCandidate < 2 || primeCandidate % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= flooredSqrt; i += 2) {
            if (primeCandidate % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static Integer flooredSqrtOf(Integer number) {
        return (int) Math.floor(Math.sqrt(number));
    }

    // binomial coefficient = "n choose k" = "n over k" = n! / (k! * (n-k)!)
    public static BigInteger binomialCoefficient(Integer n, Integer k) {
        return factorial(n).divide(factorial(k).multiply(factorial(n - k)));
    }

    // n! = 1 * 2 * ... * (n-2) * (n-1) * n
    public static BigInteger factorial(Integer n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i < n; i++) {
            result = result.multiply(BigInteger.valueOf(i + 1));
        }

        return result;
    }
}