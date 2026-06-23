package se.lexicon;

import java.util.HashMap;

public class PhoneBook {
    public static void printPhoneBook() {
        // Create phone book
        HashMap<String, String> phoneBook = new HashMap<>();

        // Add contacts
        phoneBook.put("Anna", "0701234567");
        phoneBook.put("Erik", "0702345678");
        phoneBook.put("Sara", "0703456789");
        phoneBook.put("Johan", "0704567890");

        // Ask user for a name
        String name = IO.readln("Enter a name: ");

        // Look up the contact
        if (phoneBook.containsKey(name)) {
            IO.println("Phone number: " + phoneBook.get(name));
        } else {
            IO.println("Contact not found.");
        }
    }
}
