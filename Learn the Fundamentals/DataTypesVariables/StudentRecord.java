package DataTypesVariables;

// Records in Java automatically generate constructors, getters, equals, hashCode, and toString methods.
// Custom methods can still be added, but fields remain immutable.
public record StudentRecord(String name, float firstGrade, float secondGrade) {

    // Private method to calculate the average grade using local variables.
    private float calculateAverage() {
        return (firstGrade() + secondGrade()) / 2;
    }

    // Public method to display the student's name and average grade.
    public void showStudent() {
        float average = calculateAverage();
        System.out.printf("""
        
        Student WIth Record

        %s's average: %.2f.\n
        """, name, average);
    }
}

