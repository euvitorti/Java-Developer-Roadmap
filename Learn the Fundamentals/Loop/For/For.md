# Fibonacci Sequence Using For Loop in Java

The `for` loop in Java is a versatile and commonly used loop that allows for iteration with an explicit initialization, condition, and increment/decrement in one concise line. It is ideal when the number of iterations is known beforehand.

## How It Works

- The loop is structured with three main components: initialization, condition, and increment/decrement.
- The initialization is executed once at the beginning of the loop.
- The condition is evaluated before each iteration; if `false`, the loop terminates.
- The increment or decrement is executed after each iteration.

### Syntax

```java
for (initialization; condition; increment/decrement) {
    // Code to execute in each iteration
}
```

### Key Points

- Best suited for scenarios where the number of iterations is predetermined.
- Combines all looping logic into one line for clarity.

### Fibonacci Sequence Example

This program generates the Fibonacci sequence using a `for` loop:

```java
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
```

### Output

For `n = 10`, the output is:

```
Fibonacci Sequence up to 10 terms:
0 1 1 2 3 5 8 13 21 34
```

## Learn More

For more detailed information about the `for` loop, visit the [W3Schools Java For Loop Guide](https://www.w3schools.com/java/java_for_loop.asp).
