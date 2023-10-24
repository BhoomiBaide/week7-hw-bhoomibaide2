package JavaProgrammeHw;

import java.util.Scanner;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
public class Programme_20FindValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Enter a value to check if it exists in the array: ");
        int targetValue = scanner.nextInt();

        boolean containsValue = false;

        // Iterate through the array to check if it contains the target value
        for (int number : numbers) {
            if (number == targetValue) {
                containsValue = true;
                break; // Exit the loop early if the value is found
            }
        }

        if (containsValue) {
            System.out.println("The array contains the value: " + targetValue);
        } else {
            System.out.println("The array does not contain the value: " + targetValue);
        }

        scanner.close();
    }

    }

