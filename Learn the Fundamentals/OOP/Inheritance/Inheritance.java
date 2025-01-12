package OOP.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();

        // Call the honk() method from the Vehicle class using the myCar object
        myCar.honk();

        // Access the protected 'brand' attribute from the Vehicle class
        // and the getModelName() method from the Car class to display the information
        System.out.println(myCar.brand + " " + myCar.getModelName());
    }
}
