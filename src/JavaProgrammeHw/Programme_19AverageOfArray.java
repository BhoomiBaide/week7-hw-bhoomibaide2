package JavaProgrammeHw;

import java.util.Scanner;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Programme_19AverageOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        double[] arr = new double[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        // Calculate the sum of array elements
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Calculate the average
        double average = sum / n;

        System.out.println("The average of the array elements is: " + average);

        scanner.close();
    }
}
