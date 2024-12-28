# Fibonacci Sequence Using Do-While Loop in Java

The `do-while` loop in Java is a variation of the `while` loop. It ensures that the code block is executed at least once, as the condition is checked after the first iteration. This makes it particularly useful when the loop body needs to run before verifying the condition.

## How It Works

- The loop executes the block of code once, regardless of the condition.
- After the first execution, the condition is evaluated.
- If the condition is `true`, the loop repeats; otherwise, it terminates.

### Syntax

```java
do {
    // Code to execute
} while (condition);
```

### Key Points

- The code inside the `do` block always executes at least once.
- Useful for scenarios where you need to guarantee the execution of the loop body before evaluating the condition.

### Fibonacci Sequence Example

This program generates the Fibonacci sequence using a `do-while` loop:

```java
public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10; // Number of terms to display

        System.out.println("Fibonacci Sequence up to " + n + " terms:");

        // Initialize the first two terms of the sequence
        int firstTerm = 0;
        int secondTerm = 1;
        int count = 1; // Counter to track the number of terms displayed

        do {
            System.out.print(firstTerm + " ");

            // Calculate the next term by adding the previous two terms
            int nextTerm = firstTerm + secondTerm;

            // Update the terms for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            count++; // Increment the counter
        } while (count <= n);
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

For more detailed information about the `do-while` loop, visit the [W3Schools Java Do-While Loop Guide](https://www.w3schools.com/java/java_while_loop_do.asp).
