package se.lexicon;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void printTwoSum(){
        int[] numbers = {2, 7, 11, 15, 4, 6};
        int target = 13;

        Set<Integer> seen = new HashSet<>();

        for (int num : numbers) {

            int complement = target - num;

            // If complement already seen → we found the pair
            if (seen.contains(complement)) {
                IO.println("Pair found: " + num + " + " + complement + " = " + target);
                return; // stop after first match
            }

            // Otherwise store current number
            seen.add(num);
        }

        IO.println("No pair found.");
    }
}
