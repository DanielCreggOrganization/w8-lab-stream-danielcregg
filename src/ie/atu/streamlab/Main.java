package ie.atu.streamlab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        // DIY Task 2: Basic Stream Operations
        System.out.println("\nDIY Task 2: Basic Stream Operations");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
               .filter(n -> n % 2 != 0) // Filter out even numbers
               .forEach(n -> System.out.print(n + " ")); // Print the remaining numbers
        System.out.println();
        
        // DIY Task 3: Chain Operations
        System.out.println("\nDIY Task 3: Chain Operations");
        List<String> fruits = Arrays.asList("apple", "banana", "grape", "kiwi", "orange", "mango");
        List<String> processedFruits = fruits.stream()
                                            .filter(fruit -> fruit.length() > 4) // Filter fruits with names longer than 4 characters
                                            .sorted() // Sort alphabetically
                                            .map(String::toUpperCase) // Convert to uppercase
                                            .collect(Collectors.toList()); // Collect into a new list
        processedFruits.forEach(System.out::println); // Print the results
    }
}
