/*
 * https://projecteuler.net/problem=26
 */

package Java;

public class ID026 {

    public static void main(String[] args) {
        System.out.println(calc(10));
        System.out.println(calc(1000));
    }

    // returns value d < maxDenominator for which 1/d contains the longest recurring cycle in its decimal fraction
    public static int calc(int maxDenominator) {
        int d = 0;
        int maxCycleLength = 0;

        for (int i = 1; i < maxDenominator; i++) {
            int tempCycleLength = calcRecurringCycleLength(i);

            if (maxCycleLength < tempCycleLength) {
                maxCycleLength = tempCycleLength;
                d = i;
            }
        }

        return d;
    }

    private static int calcRecurringCycleLength(int n) {
        int[] array = new int[n + 1];
        int i = 1;
        int m = 1;

        while (m != 0 && array[m] == 0) {
            array[m] = i++;
            m = m * 10 % n;
        }

        if (m == 0) {
            return 0;
        }

        return i - array[m];
    }
}