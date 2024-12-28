public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10; // Number of terms to display

        System.out.println("Fibonacci Sequence up to " + n + " terms:");

        // Initialize the first two terms of the sequence
        int firstTerm = 0;
        int secondTerm = 1;

        for (int count = 1; count <= n; count++) {
            System.out.print(firstTerm + " ");

            // Calculate the next term by adding the previous two terms
            int nextTerm = firstTerm + secondTerm;

            // Update the terms for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
