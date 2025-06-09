package com.manoj.programs;

public class VideoPlayerSettings {
    public static void main(String[] args) {
        try {
            System.out.println("Checking device compatibility");
            try {
                throw new Exception("Resolution not supported.");
            } catch (Exception e) {
                System.out.println("Inner error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer error: " + e.getMessage());
        }
    }

}
