package OOP.Encapsulation;

public class Student {

    // Declare a private variable to store the student's name.
    // The 'private' keyword restricts direct access to this variable from outside the class.
    private String name;

    // Getter method to retrieve the value of the private variable 'name'.
    // This method is declared as 'public' so it can be accessed from outside the class.
    public String getName() {
        return name;
    }

    // Setter method to set or update the value of the private variable 'name'.
    // This method is also public, allowing external code to modify the 'name' variable.
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Encapsulation is a fundamental principle of object-oriented programming.
     * It ensures that sensitive data is hidden from users, providing better control and security.
     * Key benefits and practices of encapsulation:
     *
     * 1. Declare class variables (attributes) as private.
     * 2. Use public getter and setter methods to access and modify private variables.
     * 3. Better control over class attributes and methods.
     * 4. Class attributes can be:
     *    - Read-only: If only the getter method is provided.
     *    - Write-only: If only the setter method is provided.
     * 5. Flexibility: Changes to one part of the code won't affect other parts.
     * 6. Increased security: Restricting direct access to sensitive data.
     */
}
