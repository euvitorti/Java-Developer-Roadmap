package ExceptionHandling;
public record EvenOdd() {
    public String isEvenOrOdd(int number) {
        // A ternary operator is used for concise conditional checks.
        return (number % 2 == 0) ? "Is even" : "Is odd"; // Custom logic to check even/odd
    }    
}
