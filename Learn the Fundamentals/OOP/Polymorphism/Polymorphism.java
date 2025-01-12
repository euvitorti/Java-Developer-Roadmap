package OOP.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        // Create an Animal object
        Animal myAnimal = new Animal();

        // Create a Pig object, but treat it as an Animal (polymorphism in action)
        Animal myPig = new Pig();

        // Create a Dog object, but treat it as an Animal (polymorphism in action)
        Animal myDog = new Dog();

        // Call the animalSound() method on each object
        // The actual method executed depends on the object's runtime type (dynamic method dispatch)
        myAnimal.animalSound(); // Calls the method in Animal
        myPig.animalSound();    // Calls the overridden method in Pig
        myDog.animalSound();    // Calls the overridden method in Dog
    }
}
