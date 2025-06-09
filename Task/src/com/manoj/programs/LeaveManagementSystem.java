package com.manoj.programs;

import com.manoj.exceptions.InvalidLeaveDateException;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LeaveManagementSystem {
    public static void main(String[] args) {
        LocalDate fromDate = LocalDate.of(2025, 6, 1);
        LocalDate toDate = LocalDate.of(2025, 5, 28);

        try {
            if (fromDate.isBefore(LocalDate.now()) || toDate.isBefore(LocalDate.now())) {
                throw new InvalidLeaveDateException("Cannot apply for past dates.");
            }
            if (toDate.isBefore(fromDate)) {
                throw new InvalidLeaveDateException("End date cannot be before start date.");
            }
            long days = ChronoUnit.DAYS.between(fromDate, toDate) + 1;
            System.out.println("Leave applied for " + days + " days.");
        } catch (InvalidLeaveDateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
