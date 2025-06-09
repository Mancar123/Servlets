package com.manoj.programs;

import com.manoj.exceptions.NoWiFiConnectionException;

public class IoTDevice {
    public static void main(String[] args) {
        boolean wifiConnected = false;
        try {
            if (!wifiConnected) throw new NoWiFiConnectionException("No Wi-Fi connection.");
        } catch (NoWiFiConnectionException e) {
            System.out.println(" " + e.getMessage());
        }
    }
}

