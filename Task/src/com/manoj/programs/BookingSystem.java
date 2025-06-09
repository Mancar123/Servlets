package com.manoj.programs;

import com.manoj.exceptions.PastDateException;

import java.time.LocalDate;

public class BookingSystem {
    public static void main(String[] args) {
        LocalDate bookingDate = LocalDate.of(2023, 5, 1);

        try {
            if (bookingDate.isBefore(LocalDate.now())) {
                throw new PastDateException("Cannot book for a past date.");
            }
            System.out.println("Booking confirmed for: " + bookingDate);
        } catch (PastDateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
