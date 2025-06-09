package com.manoj.programs;

public class CoordinateConverter {
    public static void main(String[] args) {
        String[] coords = {"mute", "elon"};
        try {
            for (String coord : coords) {
                try {
                    int value = Integer.parseInt(coord);
                    System.out.println("Valid coordinate: " + value);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid coordinate: " + coord);
                }
            }
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        }
    }
}
