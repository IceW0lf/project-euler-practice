/*
 * https://projecteuler.net/problem=3
 */

package Java;

public class ID3 {

    public static void main(String[] args) {
        System.out.println(calcLargestPrimeFactor(13195L));
        System.out.println(calcLargestPrimeFactor(600851475143L));
    }

    public static Long calcLargestPrimeFactor(Long num) {
        Long number = num;

        while (true) {
            Long factor = getSmallestFactor(number);

            if (factor < number) {
                number /= factor;
            } else {
                return number;
            }
        }
    }

    private static Long getSmallestFactor(Long n) {
        for (long i = 2; i <= n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }
}