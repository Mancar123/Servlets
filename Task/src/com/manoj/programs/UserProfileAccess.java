package com.manoj.programs;

public class UserProfileAccess {
    public static void main(String[] args) {
        String nickname = null;
        try {
            System.out.println("Nickname length: " + nickname.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Nickname is null.");
        }
    }
}

