/*
 * https://projecteuler.net/problem=1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

package Java;

public class ID1 {

    public static void main(String[] args) {
        System.out.println(calcSum(10));
        System.out.println(calcSum(1000));
    }

    public static Integer calcSum(int limit) {
        Integer sum = 0;

        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}