package Conditionals;

// Records in Java automatically generate constructors, getters, equals, hashCode, and toString methods.
// Custom methods can still be added, but fields remain immutable.
public record Student(String name, float firstGrade, float secondGrade) {

    // Private method to calculate the average grade using local variables.
    private float calculateAverage() {
        // Adds the two grades and divides by 2 to calculate the average.
        return (firstGrade() + secondGrade()) / 2;
    }

    // Public method to display the student's name and average grade.
    public void showStudent() {

        // Calculates the student's average by calling the private method.
        float average = calculateAverage();

        // Checks if the average is greater than or equal to 7.
        if (average >= 7) {
            // If true, the student is approved. Displays the approval message.
            System.out.printf("""
        
            Congragulations! You're approved!
    
            %s's average: %.2f.\n
            """, name, average);
        } else {
            // If false, the student is disapproved. Displays the disapproval message.
            System.out.printf("""
        
            Unfortunately you're disapproved.
    
            %s's average: %.2f.\n
            """, name, average);
        }
    }
}
