package JavaProgrammeHw;

import java.util.Scanner;

/**
 * 10. Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme_10DoOperationWithSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter a mathematical symbol (+, -, *, /): ");
        char symbol = scanner.next().charAt(0);

        double result;

        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Division by zero is not allowed.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid symbol entered.");
            scanner.close();
            return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
