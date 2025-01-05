package OOP.ClassConcept;

// The package declaration defines the folder structure where this file is located.
// "OOP.ClassOop" indicates that this file belongs to the 'OOP' package, specifically in the 'ClassOop' subfolder.

// Remember from the Java Syntax chapter that a class should always start with an uppercase first letter,
// and the name of the Java file should match the class name.

// Define a public class named "OopClass". The name of the file should be "OopClass.java".
public class Concept {

    // Declare a private integer variable named "number" and assign it the value 5.
    // This variable is accessible only within this class.
    private int number = 5;

    // The main method is the entry point of the Java application.
    public static void main(String[] args) {
        
        // To create an object of a class, use the class name followed by an object name, and the keyword 'new'.
        // Here, we are creating an object of the OopClass.
        Concept concept = new Concept();

        // Access the private variable "number" through the created object and print its value.
        // This is possible because the code accessing it is within the same class.
        System.out.println(concept.number);
    }
}
