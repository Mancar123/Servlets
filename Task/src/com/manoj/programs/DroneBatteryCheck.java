package com.manoj.programs;

import com.manoj.exceptions.LowBatteryException;

public class DroneBatteryCheck {
    public static void main(String[] args) {
        int battery = 5;
        try {
            if (battery < 10) throw new LowBatteryException("Battery below 10%!");
        } catch (LowBatteryException e) {
            System.out.println("Warning: " + e.getMessage());
        }
    }
}

