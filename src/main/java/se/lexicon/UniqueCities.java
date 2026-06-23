package se.lexicon;

import java.util.HashSet;

public class UniqueCities {
    public static void printUniqueCities(){
        HashSet<String> cities = new HashSet<>();

        cities.add("Stockholm");
        cities.add("Gothenburg");
        cities.add("Malmö");
        cities.add("Stockholm");
        cities.add("Uppsala");
        cities.add("Gothenburg");
        cities.add("Lund");

        IO.println("Unique cities:");
        for (String city : cities) {
            IO.println(city);
        }
        IO.println("\nTotal unique cities: " + cities.size());
    }
}
