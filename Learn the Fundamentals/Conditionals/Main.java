package Conditionals;

public class Main {
    
    public static void main(String[] args) {

        // Using a Record to store student data. Records are concise and immutable, 
        // ideal for data carrier classes without custom behavior.
        Student firstStudent = new Student("Raiane", 8.0f, 5.5f);
        Student secondStudent = new Student("Vítor", 10.0f, 9.0f);

        firstStudent.showStudent();
        secondStudent.showStudent();
    }
}
