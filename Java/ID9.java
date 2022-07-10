/*
 * https://projecteuler.net/problem=9
 */

package Java;

public class ID9 {

    public static void main(String[] args) {
        System.out.println(calc());
    }

    public static Integer calc() {
        for (int a = 0; a <= 1000; a++) {
            for (int b = a + 1; b <= 1000; b++) {
                int c = 1000 - a - b;

                if (b < c && a * a + b * b == c * c) {
                    return a * b * c;
                }
            }
        }

        return null;
    }
}