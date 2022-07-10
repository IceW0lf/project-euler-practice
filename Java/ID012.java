/*
 * https://projecteuler.net/problem=12
 */

package Java;

public class ID012 {

    public static void main(String[] args) {
        System.out.println(calcTriangleNumber(5));
        System.out.println(calcTriangleNumber(500));
    }

    private static Integer calcTriangleNumber(Integer divisorCount) {
        Integer triangle = 0;
        Integer flooredSqrt;
        Integer count;

        for (int i = 1;; i++) {
            triangle += i;
            flooredSqrt = MethodCollection.flooredSqrtOf(triangle);
            count = 0;

            for (int j = 1; j < flooredSqrt; j++) {
                if (triangle % j == 0) {
                    count += 2;
                }
            }

            if (flooredSqrt * flooredSqrt == triangle) {
                count++;
            }

            if (count > divisorCount) {
                return triangle;
            }
        }
    }
}