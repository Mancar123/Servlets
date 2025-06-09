package com.manoj.programs;

import java.time.LocalTime;

public class EventSchedulingConflict {
    public static void main(String[] args) {
        LocalTime firstEventEnd = LocalTime.of(14, 0);
        LocalTime secondEventStart = LocalTime.of(13, 30);

        try {
            if (!firstEventEnd.isBefore(secondEventStart)) {
                System.out.println("Events scheduled successfully.");
            } else {
                throw new IllegalArgumentException("Event conflict detected");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
