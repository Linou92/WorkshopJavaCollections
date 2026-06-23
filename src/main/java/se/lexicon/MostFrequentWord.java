package se.lexicon;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {
    public static void printMostFrequentWord() {
        String[] words = {
                "cat", "dog", "cat", "bird",
                "dog", "cat", "fish", "dog", "dog"
        };

        HashMap<String, Integer> counts = new HashMap<>();

        // Count occurrences
        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        // Find most frequent word
        String mostFrequent = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        // Print result
        IO.println(String.format(
                    """
                    Most frequent word: %s
                    Count: %d
                    """, mostFrequent, maxCount));
    }
}
