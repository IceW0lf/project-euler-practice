/*
 * https://projecteuler.net/problem=23
 */

package Java;

public class ID023 {
    
    public static void main(String[] args) {
        System.out.println(calc());
    }

    private static boolean[] numberIsAbundant = new boolean[28123 + 1];

    // returns sum of all positive integers which cannot be written as the sum of two abundant numbers
    public static Integer calc() {
        Integer sum = 0;

        for (int i = 1; i <= 28123 ;i++) {
            numberIsAbundant[i] = isAbundant(i);
        }

        for (int i = 1; i <= 28123; i++) {
            if (!isSumOfTwoAbundants(i)) {
                sum += i;
            }
        }

        return sum;
    }

    private static Boolean isAbundant(Integer number) {
        return MethodCollection.calcSumProperDivisors(number) > number;
    }

    // for each abundant number: Is (number - abundant number) also abundant?
    // true <=> number is sum of two abundant numbers
    private static Boolean isSumOfTwoAbundants(Integer number) {
        for (int i = 0; i <= number; i++) {
            if (numberIsAbundant[i] && numberIsAbundant[number - i]) {
                return true;
            }
        }

        return false;
    }
}