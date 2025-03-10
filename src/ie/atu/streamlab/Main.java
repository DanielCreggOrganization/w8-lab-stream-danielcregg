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
    }
}
