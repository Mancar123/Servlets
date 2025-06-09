package com.manoj.programs;

public class ImageResizer {
    public static void main(String[] args) {
    int width = 200, height = 300;
    try {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Dimensions must be positive.");
        }
        System.out.println("Image resized to " + width + "x" + height);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}
