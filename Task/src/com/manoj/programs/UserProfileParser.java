package com.manoj.programs;

public class UserProfileParser {
    public static void main(String[] args) {
        String json ="manoj";
        try {
            if (json == null)
                throw new Exception("No JSON data");
            try {
                int age = 22;
                System.out.println("Age: " + age);
            } catch (Exception e) {
                System.out.println("Inner error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer error: " + e.getMessage());
        }
    }

}
