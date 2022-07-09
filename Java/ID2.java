/*
 * https://projecteuler.net/problem=2
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

package Java;

public class ID2 {

    public static void main(String[] args) {
        System.out.println(calcSum(100));
        System.out.println(calcSum(4000000));
    }

    public static Integer calcSum(int limit) {
        int sum = 0;
        int f0 = 0;
        int f1 = 1;
        int temp;

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