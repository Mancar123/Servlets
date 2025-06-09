package com.manoj.programs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LeapYearValidator {
    public static void main(String[] args) {
        String dateStr = "28-02-2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate date = LocalDate.parse(dateStr, formatter);
            System.out.println("Valid birthdate: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid leap year date.");
        }
    }
}
