/*
 * https://projecteuler.net/problem=10
 */

package Java;

public class ID010 {
    
    public static void main(String[] args) {
        System.out.println(calcSumOfPrimesBelow(10));
        System.out.println(calcSumOfPrimesBelow(2000000));
    }

    public static Long calcSumOfPrimesBelow(Integer limit) {
        Long sum = 0L;
        
        for (int i = 0; i < limit; i++) {
            if(MethodCollection.primeCheck(i)) {
                sum += i;
            }
        }

        return sum;
    }     
}