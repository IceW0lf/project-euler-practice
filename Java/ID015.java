/*
 * https://projecteuler.net/problem=15
 */

package Java;

import java.math.BigInteger;

public class ID015 {

    public static void main(String[] args) {
        System.out.println(calcLatticePaths(2));
        System.out.println(calcLatticePaths(20));
    }

    public static BigInteger calcLatticePaths(Integer gridSize) {
        Integer n = 2 * gridSize;
        Integer k = gridSize;

        /*
         * Reaching the lower right corner of the grid requires making n many
         * right and down moves, in any order. (e.g. 2*20 = 40 moves)
         * There are exactly "n over k" many different paths.
         */
        return MethodCollection.binomialCoefficient(n, k);
    }
}