package Function;

public class EvenOdd {

    // Private field to store the number. Private means it can only be accessed within this class.
    private int number;

    /**
     * Constructor for the EvenOdd class.
     * A constructor is a special method used to initialize objects.
     * This constructor takes a number and sets it using the setNumber method.
     */
    public EvenOdd(int number) {
        setNumber(number); // Calls the setter method to initialize the number.
    }

    /**
     * Getter method for the number field.
     * A getter allows external classes to access private fields in a controlled way.
     * Since this method is public, it can be accessed from other classes.
     *
     * @return the stored number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Setter method for the number field.
     * A setter allows external classes to modify private fields in a controlled way.
     * Since this method is private, it can only be called from within this class.
     *
     * @param number the value to set for the field
     */
    private void setNumber(int number) {
        this.number = number; // Assigns the provided value to the private field.
    }

    /**
     * A public method to determine if the number is even or odd.
     * This is an example of a function created by the user that performs a specific operation based on the class's state.
     * It uses internal logic to check if the number is even or odd.
     *
     * @return a String indicating if the number is "Is even" or "Is odd"
     */
    public String isEvenOrOdd() {
        // A ternary operator is used for concise conditional checks.
        return (getNumber() % 2 == 0) ? "Is even" : "Is odd"; // Custom logic to check even/odd
    }
}
