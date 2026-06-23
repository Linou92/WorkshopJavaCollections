package se.lexicon;

/*
BEST COLLECTION: HashMap<String, Integer>

WHY:
- Each student has a unique name → key-value pair
- Fast lookup of grade by name
- We only need to store: name → grade

SORTING STRATEGY:
- HashMap itself is NOT sorted
- To print by highest grade:
  → Convert entries to a list
  → Sort the list using a comparator (by value descending)
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGrades {
    public static void printStudentGrades(){
        // Store student grades
        HashMap<String, Integer> grades = new HashMap<>();

        grades.put("Anna", 85);
        grades.put("Bob", 72);
        grades.put("Charlie", 91);
        grades.put("David", 66);
        grades.put("Emma", 95);
        grades.put("Frank", 78);

        // Sort by grade (value) descending
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(grades.entrySet());

        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Print sorted results
        IO.println("Students sorted by grade (high → low):");

        for (Map.Entry<String, Integer> entry : sortedList) {
            IO.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
