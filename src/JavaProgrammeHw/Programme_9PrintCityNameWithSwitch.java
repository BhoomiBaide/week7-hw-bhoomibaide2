package JavaProgrammeHw;

import java.util.Scanner;

/**
 * 9. Same as above program-8 using switch statement.
 */
public class Programme_9PrintCityNameWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0); // Read the first character of the input

        String cityName;

        switch (alphabet) {
            case 'A':
                cityName = "New York";
                break;
            case 'B':
                cityName = "Los Angeles";
                break;
            case 'C':
                cityName = "Chicago";
                break;
            case 'D':
                cityName = "Dallas";
                break;
            case 'E':
                cityName = "San Francisco";
                break;
            case 'F':
                cityName = "Miami";
                break;
            default:
                cityName = "Invalid entry";
        }

        System.out.println("City Name: " + cityName);

        scanner.close();
    }
}
