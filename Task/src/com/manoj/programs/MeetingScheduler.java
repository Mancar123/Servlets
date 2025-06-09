package com.manoj.programs;

import com.manoj.exceptions.MeetingOverlapException;

import java.time.LocalTime;

public class MeetingScheduler {
    public static void main(String[] args) {
        LocalTime existingStart = LocalTime.of(10, 0);
        LocalTime existingEnd = LocalTime.of(11, 0);

        LocalTime newStart = LocalTime.of(10, 30);
        LocalTime newEnd = LocalTime.of(11, 30);

        try {
            if (!newEnd.isBefore(existingStart) && !newStart.isAfter(existingEnd)) {
                throw new MeetingOverlapException("Meeting times overlap.");
            }
            System.out.println("Meeting scheduled successfully.");
        } catch (MeetingOverlapException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
