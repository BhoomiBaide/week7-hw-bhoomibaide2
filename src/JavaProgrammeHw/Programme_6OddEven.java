package JavaProgrammeHw;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_6OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }

}
