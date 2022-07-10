/* 
 * https://projecteuler.net/problem=6
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