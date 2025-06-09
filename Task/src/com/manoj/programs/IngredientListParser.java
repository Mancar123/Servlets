package com.manoj.programs;

public class IngredientListParser {
    public static void main(String[] args) {
        String[] ingredients = {"pizza", "roti", "chicken"};
        try {
            System.out.println(ingredients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid ingredient index.");
        }
    }
}

