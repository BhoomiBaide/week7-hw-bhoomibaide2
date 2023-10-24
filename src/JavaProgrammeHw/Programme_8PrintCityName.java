package JavaProgrammeHw;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme_8PrintCityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0); // Read the first character of the input

        String cityName;

        if (alphabet == 'A') {
            cityName = "New York";
        } else if (alphabet == 'B') {
            cityName = "Los Angeles";
        } else if (alphabet == 'C') {
            cityName = "Chicago";
        } else if (alphabet == 'D') {
            cityName = "Dallas";
        } else if (alphabet == 'E') {
            cityName = "San Francisco";
        } else if (alphabet == 'F') {
            cityName = "Miami";
        } else {
            cityName = "Invalid entry";
        }

        System.out.println("City Name: " + cityName);

        scanner.close();
    }
}
