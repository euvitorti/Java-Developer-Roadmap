package OOP.Encapsulation;

public class Main {

    public static void main(String[] args) {

        String name = "Anne";

        // Create an instance of the 'Student' class using the constructor.
        Student student = new Student();

        // Private variables in the 'Student' class cannot be accessed directly outside the class.
        // Uncommenting the following line would cause a compilation error because 'name' is private:
        // System.out.println(student.name);

        // To access private variables, use the public getter and setter methods provided in the class.
        // The 'setName' method is used here to assign the value of the 'name' variable to the private attribute in the 'Student' object.
        student.setName(name);

        // The 'getName' method is used to retrieve the value of the private 'name' attribute.
        // This value is then printed to the console.
        System.out.println(student.getName());
    }
}
