package ie.atu.streamlab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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

        // DIY Task 4: Method References Practice
        System.out.println("\nDIY Task 4: Method References Practice");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.stream()
                .map(NumberUtils::doubleNumber) // Using method reference to double each number
                .forEach(System.out::println); // Using method reference to print

        // DIY Task 5: Reduce Practice
        System.out.println("\nDIY Task 5: Reduce Practice");
        List<Integer> task5Numbers = Arrays.asList(2, 4, 6, 8, 10);

        // Calculate the product of all numbers
        int product = task5Numbers.stream()
                                  .reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);

        // Find the minimum value
        int min = task5Numbers.stream()
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("Minimum value: " + min);
        
        // DIY Task 6: File Processing with Streams
        System.out.println("\nDIY Task 6: File Processing with Streams");
        try {
            String filePath = "resources/input.txt";
            
            // Count total lines in the file
            long lineCount = Files.lines(Paths.get(filePath)).count();
            System.out.println("Total lines in file: " + lineCount);
            
            // Count words containing "Java"
            long javaWordCount = Files.lines(Paths.get(filePath))
                                     .flatMap(line -> Arrays.stream(line.split("\\s+")))
                                     .filter(word -> word.contains("Java"))
                                     .count();
            System.out.println("Words containing 'Java': " + javaWordCount);
            
            // Count all lines containing the word "streams" (case insensitive)
            long streamsCount = Files.lines(Paths.get(filePath))
                                     .filter(line -> line.toLowerCase().contains("streams"))
                                     .count();
            System.out.println("Number of lines containing 'streams': " + streamsCount);

            // Get the average line length in words
            double averageLineLength = Files.lines(Paths.get(filePath))
                                             .mapToInt(line -> line.split("\\s+").length)
                                             .average()
                                             .orElse(0);
            System.out.println("Average line length in words: " + averageLineLength);
            
        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}
