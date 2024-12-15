package DataTypesVariables;

public class Student {
    
    // How to Declare Variables in Java?
    // You must specify the data type and give the variable a unique name
    // Primitive Data Types: Byte, short, int, long, float (f), double (d), char, String, boolean

    // This class demonstrates variable declarations with primitive data types and String.
    // It also highlights instance variables and their initialization in the constructor.
    private String name; // Instance variable: Stores the student's name
    private float firstGrade; // Instance variable: First grade
    private float secondGrade; // Instance variable: Second grade
    private float average; // Instance variable: Calculated average grade

    public Student(String name, float firstGrade, float secondGrade) {
        this.name = name;
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
    }

    // A private method using a local variable to calculate the average grade.
    // Note: 'average' is also an instance variable, storing the result of this calculation.
    private void calculateAverage() {
        this.average = (firstGrade + secondGrade) / 2;
    }

    // Public method to display the student's name and average grade.
    public void showStudent() {
        calculateAverage();
        System.out.printf("""
        
        Student with out Record

        %s's average: %.2f.\n
        """, name, average);
    }
}
