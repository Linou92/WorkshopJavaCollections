package se.lexicon;

public class FindTheLargest {
    public static void printFindTheLargest() {
        int[] numbers = {14, 3, 78, 45, 22, 91, 7, 56};

        // Assume first number is the largest
        int largest = numbers[0];

        // Loop through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Print result
        IO.println("Largest number: " + largest);
    }
}
