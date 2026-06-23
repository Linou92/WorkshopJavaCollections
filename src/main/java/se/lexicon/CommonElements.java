package se.lexicon;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void printCommonElements() {
        int[] listA = {1, 3, 5, 7, 9, 11};
        int[] listB = {3, 6, 9, 12, 15};

        // Store List A in a set for fast lookup
        Set<Integer> setA = new HashSet<>();
        for (int num : listA) {
            setA.add(num);
        }

        // Find common elements
        Set<Integer> common = new HashSet<>();
        for (int num : listB) {
            if (setA.contains(num)) {
                common.add(num);
            }
        }

        // Print result
        IO.println("Common elements:");
        for (int num : common) {
            IO.print(num + " ");
        }
    }
}
