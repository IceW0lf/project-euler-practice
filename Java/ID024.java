/*
 * https://projecteuler.net/problem=24
 */

package Java;

public class ID024 {
    
    public static void main(String[] args) {
        System.out.println(calc());
    }

    // returns millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    public static String calc() {
        // first permutation in lexicographic order
        int[] permutation = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String result = "";

        for (int i = 0; i < 999999; i++) {
            nextPermutation(permutation);
        }

        for (int i = 0; i < permutation.length; i++) {
            result += permutation[i];
        }

        return result;
    }

    /*
     * https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
     */
    private static boolean nextPermutation(int[] array) {
        // Find longest non-increasing suffix
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i])
            i--;
        // Now i is the head index of the suffix
        
        // Are we at the last permutation already?
        if (i <= 0)
            return false;
        
        // Let array[i - 1] be the pivot
        // Find rightmost element greater than the pivot
        int j = array.length - 1;
        while (array[j] <= array[i - 1])
            j--;
        // Now the value array[j] will become the new pivot
        // Assertion: j >= i
        
        // Swap the pivot with j
        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;
        
        // Reverse the suffix
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        
        // Successfully computed the next permutation
        return true;
    }
}