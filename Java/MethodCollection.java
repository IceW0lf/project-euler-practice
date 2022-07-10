/*
 * collection of utility methods
 */

package Java;

public class MethodCollection {

    public static Boolean primeCheck(Integer primeCandidate) {
        Integer flooredSqrt = flooredSqrtOf(primeCandidate);

        if (primeCandidate == 2) {
            return true;
        }

        if (primeCandidate < 2 || primeCandidate % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= flooredSqrt; i += 2) {
            if (primeCandidate % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static Integer flooredSqrtOf(Integer number) {
        return (int) Math.floor(Math.sqrt(number));
    }
}