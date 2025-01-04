package ExceptionHandling;

// Import necessary classes for handling exceptions and reading inputs.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Create an instance of EvenOdd to check if the number is even or odd.
    private static EvenOdd evenOdd = new EvenOdd();

    // Create an instance of Scanner to read user input.
    private static Scanner scanner = new Scanner(System.in);

    // Method to read user inputs and handle invalid input.
    private static void readInputs() {
        // Initialize variables for storing the input and the result message.
        int input = 0;
        String result = "Please, enter a valid number!";

        try {
            // Prompt the user to enter a number.
            System.out.println("Enter number:");
            // Read the integer input from the user.
            input = scanner.nextInt();
            // Call the isEvenOrOdd method to check if the number is even or odd and store the result.
            result = evenOdd.isEvenOrOdd(input);
            // Display the result (whether the number is even or odd).
            System.out.println(result);
        } catch (InputMismatchException inputMismatchException) {
            // If an invalid input (not a number) is entered, print the error message.
            System.out.println(result);
        }
    }

    // Main method to run the application.
    public static void main(String[] args) {
        // Call the readInputs method to prompt the user and check if the input is valid.
        readInputs();
    }
}
