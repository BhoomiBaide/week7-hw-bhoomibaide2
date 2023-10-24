package JavaProgrammeHw;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_1OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration for readinginput from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        isIthOddEvenNumber(number);
        //Closing the Scanner object
        scanner.close();

    }

    public static void isIthOddEvenNumber(int number) {
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + "is" +  evenOrOdd + "number");

    }
}
