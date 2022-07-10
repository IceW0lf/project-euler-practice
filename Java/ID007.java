/*
 * https://projecteuler.net/problem=7
 */

package Java;

public class ID007 {

    public static void main(String[] args) {
        System.out.println(calcPrimeByPosition(6));
        System.out.println(calcPrimeByPosition(10001));
    }

    private static Integer calcPrimeByPosition(Integer pos) {
        for (int counter = 0, primeCandidate = 1;; primeCandidate++) {
            if (MethodCollection.primeCheck(primeCandidate)) {
                if (++counter == pos) {
                    return primeCandidate;
                }
            }
        }
    }
}