package com.ontariotechu.sofe3980U;

public class NextDate {

    public static String findNextDate(int day, int month, int year) {
        // Check for leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Number of days in each month
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Update February days for leap year
        if (isLeapYear) {
            daysInMonth[2] = 29;
        }

        // Handle edge cases
        if (day < 1 || day > daysInMonth[month] || month < 1 || month > 12 || year < 1812 || year > 2212) {
            return "Invalid date";
        }

        // Increment day
        if (day < daysInMonth[month]) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }

        return day + "/" + month + "/" + year;
    }
}
