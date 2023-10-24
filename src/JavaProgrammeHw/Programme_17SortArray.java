package JavaProgrammeHw;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17SortArray {
    public static void main(String[] args) {
        int[] numericArray = { 5, 2, 8, 7, 1 };
        String[] stringArray = { "apple", "banana", "orange", "pear", "kiwi" };

        // Sort the numeric array in ascending order
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

        // Sort the string array in ascending order
        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));

    }
}
