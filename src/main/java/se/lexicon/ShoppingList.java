package se.lexicon;

import java.util.ArrayList;

public class ShoppingList {
    public static void printShoppingList(){

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");
        shoppingList.add("Butter");
        shoppingList.add("Apples");

        // Print all items numbered
        IO.println("Shopping List:");
        for(int i = 0; i<shoppingList.size();i++){
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }

        // Remove one item by name
        shoppingList.remove("Butter");

        // Print the updated list
        System.out.println("\nUpdated Shopping List:");
        for(
                int i = 0; i<shoppingList.size();i++){
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }
    }
}
