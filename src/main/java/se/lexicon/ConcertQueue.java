package se.lexicon;

/*
BEST COLLECTION: Queue (LinkedList implementation)

WHY:
- A queue follows FIFO (First In, First Out)
- People join at the back (enqueue)
- People are removed from the front (dequeue)
- LinkedList implements Queue efficiently in Java
*/

import java.util.LinkedList;
import java.util.Queue;

public class ConcertQueue {
    public static void printConcertQueue() {
        Queue<String> queue = new LinkedList<>();

        // Add at least 6 people to the queue
        queue.add("Anna");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("David");
        queue.add("Emma");
        queue.add("Frank");

        // Let in (remove) 2 people from the front
        IO.println("Letting in: " + queue.poll());
        IO.println("Letting in: " + queue.poll());

        // Print remaining queue
        IO.println("\nRemaining queue:");
        for (String person : queue) {
            IO.println(person);
        }
    }
}
