# While Loop in Java

The `while` loop is a fundamental control flow statement in Java that allows code to be executed repeatedly based on a given boolean condition. It is particularly useful when the number of iterations is not predetermined and depends on dynamic conditions during runtime.

## How It Works

- The condition is evaluated before each iteration.
- If the condition is `true`, the code inside the loop executes.
- If the condition becomes `false`, the loop stops.

### Syntax

```java
while (condition) {
    // Code to execute
}
```

### Key Points

- The loop continues as long as the condition evaluates to `true`.
- Ensure the condition eventually becomes `false` to avoid infinite loops.
- If the condition is initially `false`, the loop body will not execute even once.

### Example

```java
int i = 0;
while (i < 5) {
    System.out.println("Iteration: " + i);
    i++; // Increment the counter to avoid infinite loop
}
```

### Output
```
Iteration: 0
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
```

## Learn More

For more detailed information and examples, visit the [W3Schools Java While Loop Guide](https://www.w3schools.com/java/java_while_loop.asp).
