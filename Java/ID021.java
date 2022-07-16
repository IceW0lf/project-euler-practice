/*
 * https://projecteuler.net/problem=21
 */

package Java;

public class ID021 {
    
    public static void main(String[] args) {
        System.out.println(calcSumAmicableNumbersBelow(10000));
    }

    public static Integer calcSumAmicableNumbersBelow(Integer limit) {
        Integer sum = 0;
        
        for (int i = 0; i < limit; i++) {
            Integer j = calcSumProperDivisors(i);

            if (i != j && i == calcSumProperDivisors(j)) {
                sum += i;
            }
        }

        return sum;
    }

    private static Integer calcSumProperDivisors(Integer number) {
        Integer sum = 0;
        
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}