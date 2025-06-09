package com.manoj.programs;

import java.util.Scanner;

public class GameMenu {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1. Start Game\n2. Load Game\n3. Exit");
    try {
        int choice = sc.nextInt();
        switch (choice) {
            case 1: System.out.println("Starting game..."); break;
            case 2: System.out.println("Loading game..."); break;
            case 3: System.out.println("Exiting..."); break;
            default: throw new IllegalArgumentException("Invalid choice.");
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}

