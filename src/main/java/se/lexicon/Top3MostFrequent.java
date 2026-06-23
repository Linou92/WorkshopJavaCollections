package se.lexicon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top3MostFrequent {
    public static void printTop3MostFrequent() {
        String[] words = {
                "java", "python", "java", "c++",
                "python", "java", "ruby", "c++",
                "python", "ruby", "java"
        };

        // Count frequencies
        HashMap<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        // Sort by frequency (descending)
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(counts.entrySet());

        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Print top 3
        IO.println("Top 3 most frequent words:");

        for (int i = 0; i < Math.min(3, list.size()); i++) {
            Map.Entry<String, Integer> entry = list.get(i);
            IO.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
