package se.lexicon;

import java.util.LinkedHashSet;
import java.util.Set;

public class MergeWithoutDuplicates {
    public static void printMergeWithoutDuplicates(){
        int[] listA = {1, 2, 3, 4, 5};
        int[] listB = {3, 4, 5, 6, 7};

        Set<Integer> merged = new LinkedHashSet<>();

        // Add all elements from List A
        for (int num : listA) {
            merged.add(num);
        }

        // Add all elements from List B
        for (int num : listB) {
            merged.add(num);
        }

        // Print result
        IO.println("Merged list (no duplicates):");
        for (int num : merged) {
            IO.print(num + " ");
        }

        IO.println("\nTotal count: " + merged.size());
    }
}
