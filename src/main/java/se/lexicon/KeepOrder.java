package se.lexicon;

import java.util.LinkedHashSet;
import java.util.Set;

public class KeepOrder {
    public static void printKeepOrder(){
        int[] numbers = {4, 7, 2, 7, 9, 4, 1, 9, 3};

        Set<Integer> seen = new LinkedHashSet<>();

        // Add numbers (duplicates are automatically ignored)
        for (int num : numbers) {
            seen.add(num);
        }

        // Print result
        IO.println("List without duplicates:");
        for (int num : seen) {
            IO.print(num + " ");
        }
    }
}
