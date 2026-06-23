package se.lexicon;

/* BEST COLLECTION: HashSet<String>

WHY:
- It automatically prevents duplicates
- Fast lookup (you can easily check if a student already submitted)
- We only care IF a student submitted, not the order or multiple submissions
- Order does NOT matter, so we don’t need LinkedHashSet */

import java.util.HashSet;
import java.util.Set;

public class SubmissionTracker {
    public static void printSubmissionTracker(){
        Set<String> submissions = new HashSet<>();

        String[] students = {
                "Anna", "Bob", "Alice", "Charlie",
                "Anna", "David", "Bob", "Emma",
                "Frank", "Alice"
        };

        for (String student : students) {
            if (submissions.contains(student)) {
                IO.println("Rejected duplicate submission from: " + student);
            } else {
                submissions.add(student);
            }
        }

        IO.println("\nFinal list of submitted students:");
        for (String student : submissions) {
            IO.println(student);
        }
    }
}
