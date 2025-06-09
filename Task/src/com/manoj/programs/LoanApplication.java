package com.manoj.programs;

import com.manoj.exceptions.AgeNotEligibleException;

import java.time.LocalDate;
import java.time.Period;

public class LoanApplication {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2003, 3, 3);

        try {
            int age = Period.between(dob, LocalDate.now()).getYears();
            if (age < 21 || age > 60) {
                throw new AgeNotEligibleException("Age not eligible for loan.");
            }
            System.out.println("Loan application accepted. Age: " + age);
        } catch (AgeNotEligibleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
