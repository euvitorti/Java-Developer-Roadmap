package OOP.Inheritance;

// The Car class inherits attributes and methods from the Vehicle class
public class Car extends Vehicle {
    private String modelName = "Mustang"; // Attribute specific to the Car class

    // Getter method to access the private attribute modelName
    public String getModelName() {
        return modelName;
    }
}