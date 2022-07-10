/*
 * collection of utility methods
 */

package Java;

public class MethodCollection {

    public static Boolean primeCheck(Integer primeCandidate) {
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