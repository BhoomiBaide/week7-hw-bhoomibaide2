package JavaProgrammeHw;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme_16PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        scanner.close();

        if (num > 0) {
            System.out.println(num + " is POSITIVE.");
        } else if (num < 0) {
            System.out.println(num + " is NEGATIVE.");
        } else {
            System.out.println("IT's ZERO.");
        }
    }
}
