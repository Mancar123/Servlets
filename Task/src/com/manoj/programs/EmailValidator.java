package com.manoj.programs;

public class EmailValidator {
    public static void main(String[] args) {
        String email = "manoj";
        try {
            if (!email.contains("@"))
                throw new Exception("Invalid email format.");
            try {
                String domain = email.split("@")[1];
                if (!domain.contains(".")) throw new Exception("Invalid domain.");
            } catch (Exception e) {
                System.out.println("Inner error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer error: " + e.getMessage());
        }
    }

}
