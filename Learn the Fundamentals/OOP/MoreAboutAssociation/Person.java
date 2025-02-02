package OOP.MoreAboutAssociation;

// Class that represents a person, containing information like name, CPF, and RG.
public class Person {
    // Private attributes of the Person class. Name is a String, while CPF and RG are objects of other classes.
    private String name;
    private CPF cpf; // Associates a CPF object with the person
    private RG rg;   // Associates an RG object with the person

    // Constructor that initializes the attributes of the Person class. It receives name, CPF, and RG as parameters.
    public Person(String name, String cpf, String rg) {
        this.cpf = new CPF(cpf);  // Creates a CPF object with the value received in the cpf parameter
        this.rg = new RG(rg);     // Creates an RG object with the value received in the rg parameter
        this.name = name;         // Initializes the person's name
    }

    // Getter method to return the person's name
    public String getName() {
        return name;
    }

    // Getter method to return the person's CPF
    public CPF getCpf() {
        return cpf;
    }

    // Getter method to return the person's RG
    public RG getRg() {
        return rg;
    }

    // Overridden toString method to represent the person with their documents
    @Override
    public String toString() {
        // Returns a string with the person's name, CPF, and RG formatted
        return name + " has a CPF " + cpf.getCpf() + " and an RG " + rg.getRg();
    }

    // Main method that creates a Person object and prints the information to the screen
    public static void main(String[] args) {
        // Creates a Person object with specific name, CPF, and RG
        Person person = new Person("Caju", "429.710.738-26", "98.021.371-85");

        // Prints the person's information using the toString() method
        System.out.println(person);  // The toString() method will be called automatically
    }
}
