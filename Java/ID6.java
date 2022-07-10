/* 
 * https://projecteuler.net/problem=6
 * 
 * The sum of the squares of the first ten natural numbers is,
 *     1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 *     (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

package Java;

public class ID6 {

    public static void main(String[] args) {
        System.out.println(calc(10));
        System.out.println(calc(100));
    }

    public static Integer calc(Integer limit) {
        Integer sum = 0;
        Integer sumOfSquares = 0;

        for (int i = 1; i <= limit; i++) {
            sumOfSquares += i * i;
            sum += i;
        }

        return sum * sum - sumOfSquares;
    }
}