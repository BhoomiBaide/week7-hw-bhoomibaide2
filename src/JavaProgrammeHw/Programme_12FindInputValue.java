package JavaProgrammeHw;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12FindInputValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String input = scanner.next();

        if (isNumber(input)) {
            System.out.println("Input is a number.");
        } else if (isAlphabet(input)) {
            System.out.println("Input is an alphabet.");
        } else {
            System.out.println("Input is a symbol.");
        }

        scanner.close();
    }

    public static boolean isNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isAlphabet(String input) {
        return input.matches("[a-zA-Z]+");
    }
}
