/*
 * https://projecteuler.net/problem=2
 */

package Java;

public class ID002 {

    public static void main(String[] args) {
        System.out.println(calcSum(100));
        System.out.println(calcSum(4000000));
    }

    public static Integer calcSum(int limit) {
        Integer sum = 0;
        Integer f0 = 0;
        Integer f1 = 1;
        Integer temp;

        while (f0 + f1 < limit) {
            temp = f1;
            f1 += f0;
            f0 = temp;

            if (f1 % 2 == 0) {
                sum += f1;
            }
        }
        
        return sum;
    }
}