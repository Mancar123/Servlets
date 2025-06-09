package com.manoj.programs;

import com.manoj.exceptions.InvalidColorCodeException;

public class ColorCodeValidator {
    public static void main(String[] args) {
        String colorCode = "#12Z45G";
        try {
            if (!colorCode.matches("#[0-9A-Fa-f]{6}"))
                throw new InvalidColorCodeException("Invalid color code.");
        } catch (InvalidColorCodeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
