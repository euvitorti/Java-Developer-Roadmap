package OOP.Inheritance;

// Base class (superclass) named Vehicle
public class Vehicle {
    // Attribute with a protected access modifier
    // This allows subclasses to access the attribute directly
    protected String brand = "Ford";

    // Public method that can be called by instances of Vehicle or its subclasses
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}