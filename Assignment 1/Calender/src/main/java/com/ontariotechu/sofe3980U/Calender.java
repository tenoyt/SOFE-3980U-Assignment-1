package com.ontariotechu.sofe3980U;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        int month, day, year; String nextDate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calender!");
        char c;
        do {
            System.out.println("Enter the date in DD MM YYYY");
            System.out.print("Day (1-31): ");
                    day = scanner.nextInt();
                        System.out.print("Month (1-12): ");
                            month = scanner.nextInt();
                                System.out.print("Year (1812-2212): ");
                                    year = scanner.nextInt();
            nextDate = NextDate.findNextDate(day, month, year);
            System.out.println("Next date is: " + nextDate);
            System.out.println("Do you wish to continue?(Y/N)");
            c = scanner.next().charAt(0);
        } while (c == 'Y');
    }
}