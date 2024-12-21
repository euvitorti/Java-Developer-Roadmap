package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // A static Scanner object to read input from the console.
    private static Scanner scanner = new Scanner(System.in); // Function from the Java library to read user input.

    /**
     * Reads a list of numbers from the user until they enter -1.
     * This is a custom function created by the user to manage user input.
     *
     * @return a List of integers entered by the user
     */
    private static List<Integer> readInputs() {
        List<Integer> numbers = new ArrayList<>(); // Creates an empty list to store numbers.
        System.out.println("Enter numbers (type -1 to stop):");
        while (true) {
            int number = scanner.nextInt(); // Function from the Java library to read an integer from the user.
            if (number == -1) { // Sentinel value to terminate input.
                break; // Java keyword to exit the loop early.
            }
            numbers.add(number); // Java method from the ArrayList class to add a number to the list.
        }
        return numbers; // Returns the list of numbers. This is a custom function result.
    }

    /**
     * Processes a list of numbers to determine if each is even or odd.
     * Uses a for-each loop to iterate through the list.
     *
     * @param numbers the list of numbers to process
     */
    private static void processNumbers(List<Integer> numbers) {
        // A for-each loop is used to simplify iteration through the list.
        for (int number : numbers) {
            EvenOdd evenOdd = new EvenOdd(number); // Custom function to create an EvenOdd object.
            String result = evenOdd.isEvenOrOdd(); // Calls the custom method isEvenOrOdd.
            System.out.println("Number " + number + ": " + result); // Prints the result, a method from the Java library.
        }
    }

    /**
     * The entry point of the program. The main method is where the JVM starts execution.
     * This method coordinates the program by calling other functions.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        List<Integer> numbers = readInputs(); // Calls the custom function to get the list of numbers.
        processNumbers(numbers); // Calls the custom function to process the numbers.
    }
}
