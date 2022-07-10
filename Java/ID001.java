/*
 * https://projecteuler.net/problem=1
 */

package Java;

public class ID001 {

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