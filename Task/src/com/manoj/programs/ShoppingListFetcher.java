package com.manoj.programs;

public class ShoppingListFetcher {
    public static void main(String[] args) {
    String[] shoppingList = {"watch", "sneakers", "dress"};
    try {
        System.out.println(shoppingList[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(" Invalid shopping list index.");
    }
}
}
