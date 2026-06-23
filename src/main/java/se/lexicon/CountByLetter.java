package se.lexicon;

public class CountByLetter {
    public static void printCountbyLetter(){
        String[] names = {"Anna", "Bob", "Alice", "Charlie", "Amanda", "David", "Amy", "Brian"};

        String input = IO.readln("Enter a letter: ");

        // Take only the first character and make it lowercase
        char letter = Character.toLowerCase(input.charAt(0));

        int count = 0;

        for (String name : names) {
            if (Character.toLowerCase(name.charAt(0)) == letter) {
                count++;
            }
        }

        IO.println("Number of names starting with '" + letter + "': " + count);
    }
}
