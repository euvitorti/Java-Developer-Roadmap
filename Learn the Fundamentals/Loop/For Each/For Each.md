# Understanding the for-each Loop in Java

The for-each loop is a simpler way to iterate through elements in a collection or array in Java. It was introduced in Java 5 and is commonly used for its readability and simplicity. Instead of manually managing an index, the for-each loop automatically traverses each element in the collection, making your code cleaner and easier to understand.

---

## Key Features of the for-each Loop

- Readability: Simplifies the process of iterating through elements.
- Safety: Reduces the chances of errors related to index manipulation.
- Efficiency: Automatically handles the traversal of the collection or array.

## Syntax

```
    for (type variable : collection) {
        // Code to execute for each element
    }
```

---

## Example

Here is a simple example using an integer array:
```
    int[] numbers = {10, 20, 30, 40, 50};

    for (int number : numbers) {
        System.out.println(number);
    }
```

Output
```
    10
    20
    30
    40
    50
```

In this example, the for-each loop iterates through each element in the numbers array and prints its value.

---

### Learn More

For a deeper understanding and more examples, check out the detailed explanation on [W3Schools - Java For Each Loop](https://www.w3schools.com/java/java_foreach_loop.asp).