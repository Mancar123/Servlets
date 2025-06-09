package com.manoj.programs;

public class TemperatureConverter  {
    public static void main(String[] args) {
        String tempInput = "mac";
        try {
            double temp = Double.parseDouble(tempInput);
            System.out.println("Temperature: " + temp);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid temperature input.");
        }
    }
}

