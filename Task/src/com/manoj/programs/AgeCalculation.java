package com.manoj.programs;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class AgeCalculation {
    public static void main(String[] args) {
        String birthdateStr = "2003-15-01";

        try {
            LocalDate birthdate = LocalDate.parse(birthdateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            int age = Period.between(birthdate, LocalDate.now()).getYears();
            System.out.println("Age: " + age);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid birthdate format: " + e.getMessage());
        }
    }
}

