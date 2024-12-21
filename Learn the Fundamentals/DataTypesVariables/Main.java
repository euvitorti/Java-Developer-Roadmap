package DataTypesVariables;

public class Main {
    
    // Using a Record to store student data. Records are concise and immutable, 
    // ideal for data carrier classes without custom behavior.
    private static StudentRecord studentWithRecord = new StudentRecord("Raiane", 8.0f, 5.5f);

    // Using a traditional class to store student data, allowing for more flexibility 
    private static Student studentWithOutRecord = new Student("Suelen", 9.3f, 8.4f);

    // ENUM usage: This method calculates weight on different planets based on gravity ratios.
    private static void gravity(double personWeight) {
        double weight = 0;
        
        for (EnumPlanet planet : EnumPlanet.values()) {
            // Calculates the equivalent weight on a given planet
            weight = (planet.getGravity() / EnumPlanet.EARTH.getGravity()) * personWeight;

            System.out.printf("Your weight on %s: %.2f.\n", planet.name(), weight);
        }
    }

    public static void main(String[] args) {
        studentWithOutRecord.showStudent();
        studentWithRecord.showStudent();
        gravity(70);
    }
}
