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
            Integer j = MethodCollection.calcSumProperDivisors(i);

            if (i != j && i == MethodCollection.calcSumProperDivisors(j)) {
                sum += i;
            }
        }

        return sum;
    }
}