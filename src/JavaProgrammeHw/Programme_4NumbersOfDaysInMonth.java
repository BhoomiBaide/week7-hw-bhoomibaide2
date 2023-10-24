package JavaProgrammeHw;

/**
 * 4. Number of Days In Month
 */
public class Programme_4NumbersOfDaysInMonth {
    public static void main(String[] args) {
        int year = 2020;
        int month = 2;
        int days = getDaysInMonth(month, year);
        System.out.println("Days in month " + month + " in year " + year + ": " + days);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        int daysInMonth;

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;
                break;

            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                daysInMonth = 30;
                break;

            case 2: // February
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;

            default:
                daysInMonth = -1; // Invalid month
                break;
        }

        return daysInMonth;
    }
}


