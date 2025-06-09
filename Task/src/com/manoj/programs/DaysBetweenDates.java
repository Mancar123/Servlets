package com.manoj.programs;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {
    public static void main(String[] args) {
        String start = "2024-05-01";
        String end = "wrong-date";

        try {
            LocalDate d1 = LocalDate.parse(start);
            LocalDate d2 = LocalDate.parse(end);
            long days = ChronoUnit.DAYS.between(d1, d2);
            System.out.println("Days between: " + days);
        } catch (NullPointerException | DateTimeParseException e) {
            System.out.println("Error: Invalid or null date input.");
        }
    }
}
