package com.manoj.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TemperatureLogger {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("temperature.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Temperature: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading log: " + e.getMessage());
        }
    }
}
