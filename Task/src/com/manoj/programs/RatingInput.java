package com.manoj.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RatingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter rating 1 to 5: ");
            int rating = sc.nextInt();
            System.out.println("Rating: " + rating);
        } catch (InputMismatchException e) {
            System.out.println("Error: Non-numeric rating.");
        }
    }
}

