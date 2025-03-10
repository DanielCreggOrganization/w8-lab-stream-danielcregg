package ie.atu.streamlab;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // DIY Task 2: Basic Stream Operations
        System.out.println("\nDIY Task 2: Basic Stream Operations");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
               .filter(n -> n % 2 != 0) // Filter out even numbers
               .forEach(n -> System.out.print(n + " ")); // Print the remaining numbers
        System.out.println();
    }
}
