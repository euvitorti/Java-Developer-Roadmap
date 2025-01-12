package OOP.Polymorphism;

// The Dog class extends the Animal class, inheriting its methods
// It overrides the animalSound() method to provide a specific implementation for Dog
class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
