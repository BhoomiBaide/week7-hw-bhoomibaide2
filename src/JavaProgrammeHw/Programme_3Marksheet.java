package JavaProgrammeHw;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35
 */
public class Programme_3Marksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________________________");
        System.out.println("|                           |");
        System.out.println("|      Mark Sheet           |");
        System.out.println("|____________________________|");


        //Input student information
        System.out.println("Enter student's Name:   ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        System.out.println("| Name : " + name);
        System.out.println("| Roll No : " + rollNo);
        System.out.println("|____________________________|");
        System.out.println("| Subjects : Marks          |");
        System.out.println("|____________________________|");

        // Input marks for Math, Science, and English
        int mathMarks, scienceMarks, englishMarks;
        System.out.print("Math : ");
        mathMarks = scanner.nextInt();
        System.out.print("Science : ");
        scienceMarks = scanner.nextInt();
        System.out.print("English : ");
        englishMarks = scanner.nextInt();

        // Check if the entered marks are in the valid range (0-100)
        if (isInvalidMarks(mathMarks) || isInvalidMarks(scienceMarks) || isInvalidMarks(englishMarks)) {
            System.out.println("Invalid Input, Marks should be between 0 to 100.");
            return;
        }

        // Calculate total marks and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 300.0) * 100;

        // Determine the result and grade
        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade = calculateGrade(percentage);

        // Print the mark sheet
        System.out.println("| Math : " + mathMarks);
        System.out.println("| Science : " + scienceMarks);
        System.out.println("| English : " + englishMarks);
        System.out.println("|____________________________|");
        System.out.println("| Total : " + totalMarks);
        System.out.println("|____________________________|");
        System.out.println("| Percentage : " + percentage + "%");
        System.out.println("| Result : " + result);
        System.out.println("| Grade : " + grade);
        System.out.println("|____________________________|");

        scanner.close();
    }

    public static boolean isInvalidMarks(int marks) {
        return marks < 0 || marks > 100;
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 60) {
            return "A";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        } else {
            return "Fail";
        }
    }
}
