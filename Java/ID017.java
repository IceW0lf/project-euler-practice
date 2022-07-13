/*
 * https://projecteuler.net/problem=17
 */

package Java;

public class ID017 {

    public static void main(String[] args) {
        System.out.println(calcNumberOfLetters(5));
        System.out.println(calcNumberOfLetters(1000));
    }

    public static Integer calcNumberOfLetters(Integer max) {
        Integer sum = 0;

        for (int i = 1; i <= max; i++) {
            sum += numberToString(i).length();
        }

        return sum;
    }

    private static String numberToString(Integer number) {
        if (number < 20) {
            return zeroToNineteen[number];
        } else if (number >= 20 && number < 100) {
            return twentyToNinety[number / 10 - 2] + (number % 10 != 0 ? zeroToNineteen[number % 10] : "");
        } else if (number >= 100 && number < 1000) {
            return zeroToNineteen[number / 100] + "hundred" + (number % 100 != 0 ? "and" + numberToString(number % 100) : "");
        } else if (number == 1000) {
            return "onethousand";
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static String[] zeroToNineteen = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", 
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

    private static String[] twentyToNinety = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
}