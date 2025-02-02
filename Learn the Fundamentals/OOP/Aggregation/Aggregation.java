package OOP.Aggregation;

import java.util.List;
import java.util.ArrayList;

// Class representing a Teacher
class Teacher {
    private String name;  // Private field to store teacher's name

    // Constructor to initialize the teacher's name
    public Teacher(String name) {
        this.name = name;
    }

    // Getter method to retrieve the teacher's name
    public String getName() {
        return name;
    }
}

// Class representing a Department that contains multiple teachers
class Department {
    private String name;  // Private field to store department's name
    private List<Teacher> teachers;  // List to store teachers in the department

    // Constructor to initialize the department's name and instantiate the teacher list
    public Department(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();  // Creating an empty list of teachers
    }

    // Method to add a teacher to the department
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Method to display the department name and list of teachers
    public void showTeachers() {
        System.out.println("Department: " + name);  // Print department name
        for (Teacher t : teachers) {  // Loop through the list of teachers
            System.out.println("Teacher: " + t.getName());  // Print each teacher's name
        }
    }
}

// Main class demonstrating aggregation (Department contains Teachers)
class AggregationExample {
    public static void main(String[] args) {
        // Creating Teacher objects
        Teacher t1 = new Teacher("Mr. Smith");
        Teacher t2 = new Teacher("Ms. Johnson");

        // Creating a Department object
        Department department = new Department("Computer Science");

        // Adding teachers to the department
        department.addTeacher(t1);
        department.addTeacher(t2);

        // Displaying department details along with its teachers
        department.showTeachers();
    }
}
