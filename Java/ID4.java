/*
 * https://projecteuler.net/problem=4
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

package Java;

public class ID4 {

    public static void main(String[] args) {
        System.out.println(calcLargestPalindrome(2));
        System.out.println(calcLargestPalindrome(3));
    }

    public static Integer calcLargestPalindrome(int digitCount) {
        Integer max = (int) Math.pow(10.0, digitCount);
        Integer palindrome = 0;
        Integer temp;

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                temp = i * j;
                if (palindromeCheck(temp) && temp > palindrome) {
                    palindrome = temp;
                }
            }
        }

        return palindrome;
    }

    private static Boolean palindromeCheck(int number) {
        Integer num = number;
        Integer sum = 0;
        Integer temp;

        while (num > 0) {
            temp = num % 10;
            sum = (sum * 10) + temp;
            num /= 10;
        }

        return sum == number ? true : false;
    }
}