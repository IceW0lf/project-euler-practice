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

        return MethodCollection.binomialCoefficient(n, k);
    }
}