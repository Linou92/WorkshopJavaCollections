package se.lexicon;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordFrequency {
    public static void printWordFrequency() {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple", "grape", "orange"};

        // Count occurrences
        HashMap<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        // Sort alphabetically using TreeMap
        TreeMap<String, Integer> sortedCounts = new TreeMap<>(counts);

        // Print results
        for (Map.Entry<String, Integer> entry : sortedCounts.entrySet()) {
            IO.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
