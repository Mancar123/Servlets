package com.manoj.programs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NullDateHandler {
    public static void main(String[] args) {
        LocalDate date = null;

        try {
            String formatted = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            System.out.println("Formatted Date: " + formatted);
        } catch (NullPointerException e) {
            System.out.println("Error: Date is null.");
        }
    }
}
