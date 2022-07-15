/*
 * https://projecteuler.net/problem=19
 */

package Java;

public class ID019 {

    public static void main(String[] args) {
        System.out.println(calcFirstOfMonthSundaysDuring20thCentury());
    }

    public static Integer calcFirstOfMonthSundaysDuring20thCentury() {
        Integer sundayCounter = 0;

        for (int year = 1901; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                if (zellersCongruence(1, month, year) == 1) {
                    sundayCounter++;
                }
            }
        }

        return sundayCounter;
    }

    private static Integer zellersCongruence(Integer day, Integer month, Integer year) {

        // January is counted as month 13 of the previous year
        if (month == 1) {
            month = 13;
            year--;
        }

        // February is counted as month 14 of the previous year
        if (month == 2) {
            month = 14;
            year--;
        }

        // q = day of the month
        int q = day;

        // m = month (3 = March, 4 = April, ..., 14 = February)
        int m = month;

        // k = year of the century (year % 100)
        int k = year % 100;

        // j = zero-based century (floor(year / 100))
        int j = year / 100;

        // h = day of the week (0 = Saturday, 1 = Sunday, ..., 6 = Friday)
        int h = (q + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        return h;
    }
}