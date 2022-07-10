/*
 * https://projecteuler.net/problem=7
 */

package Java;

public class ID7 {

    public static void main(String[] args) {
        System.out.println(calcPrimeByPosition(6));
        System.out.println(calcPrimeByPosition(10001));
    }

    private static Integer calcPrimeByPosition(Integer pos) {
        for (int counter = 0, primeCandidate = 1;; primeCandidate++) {
            if (primeCheck(primeCandidate)) {
                if (++counter == pos) {
                    return primeCandidate;
                }
            }
        }
    }

    private static Boolean primeCheck(Integer primeCandidate) {
        Integer flooredSqrtOfPrimeCandidate = (int) Math.floor(Math.sqrt(primeCandidate));

        if (primeCandidate == 2) {
            return true;
        }

        if (primeCandidate < 2 || primeCandidate % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= flooredSqrtOfPrimeCandidate; i += 2) {
            if (primeCandidate % i == 0) {
                return false;
            }
        }

        return true;
    }
}