package Bubblesort;

import java.util.HashSet;

public class RemoveDuplicates {
public static String removeDuplicates(String input) {
    // Use a HashSet to track seen characters
    HashSet<Character> seen = new HashSet<>();
    StringBuilder result = new StringBuilder();

    // Iterate over each character in the input string
    for (char c : input.toCharArray()) {
        // If the character is not already in the set, add it
        if (!seen.contains(c)) {
            seen.add(c);
            result.append(c);
        }
    }

    // Return the resulting string without duplicates
    return result.toString();
}

public static void main(String[] args) {
    // Example input
    String input = "programming";
    String result = removeDuplicates(input);

    // Print the result
    System.out.println("Original String: " + input);
    System.out.println("String after removing duplicates: " + result);
}
}