package se.lexicon;

import java.util.HashSet;
import java.util.Set;

public class SecondLargest {
    public static void printSecondLargest(){
        int[] numbers = {34, 78, 23, 78, 91, 56, 91, 12};

        // remove duplicates using a Set
        Set<Integer> unique = new HashSet<>();
        for (int num : numbers) {
            unique.add(num);
        }

        // find largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : unique) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        IO.println("Second largest unique value: " + secondLargest);
    }
}
