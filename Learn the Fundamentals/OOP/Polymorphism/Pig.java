package OOP.Polymorphism;

// The Pig class extends the Animal class, inheriting its methods
// It overrides the animalSound() method to provide a specific implementation for Pig
class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
