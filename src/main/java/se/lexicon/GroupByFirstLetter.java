package se.lexicon;

import java.util.*;

public class GroupByFirstLetter {
    public static void printGroupByFirstLetter(){
        String[] names = {
                "Alice", "Bob", "Anna", "Charlie",
                "Brian", "Amanda", "Carl"
        };

        // Map: first letter → list of names
        HashMap<Character, List<String>> groups = new HashMap<>();

        for (String name : names) {
            char firstLetter = name.charAt(0);

            // If key doesn't exist, create new list
            groups.putIfAbsent(firstLetter, new ArrayList<>());

            // Add name to the correct group
            groups.get(firstLetter).add(name);
        }

        // Print groups (sorted by letter)
        TreeMap<Character, List<String>> sortedGroups = new TreeMap<>(groups);

        for (Map.Entry<Character, List<String>> entry : sortedGroups.entrySet()) {
            IO.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
