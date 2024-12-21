package DataTypesVariables;

// Enum representing planets with their respective gravitational constants.
// Provides a method to retrieve gravity for calculations.
public enum EnumPlanet {

    MERCURY(3.7), VENUS(8.87), EARTH(9.8), MARS(3.71), 
    JUPITER(24.79), SATURN(10.44), URANUS(8.69), NEPTUNE(11.15);

    private final double gravity; // Instance variable: Gravitational constant for the planet

    private EnumPlanet(double gravity) {
        this.gravity = gravity;
    }

    // Getter method for the gravity field.
    public double getGravity() {
        return gravity;
    }
}
