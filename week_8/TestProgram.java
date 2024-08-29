
    
    // Superclass Person
class Person {
    // Fields
    private String name;
    private int yearOfBirth;

    // Constructor
    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // Method to get the person's name
    public String getName() {
        return name;
    }

    // Method to get the person's year of birth
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    // Method to represent the object as a string
    public String toString() {
        return "Name: " + name + ", Year of Birth: " + yearOfBirth;
    }
}

// Subclass Student
class Student extends Person {
    // Fields specific to Student
    private String major;

    // Constructor
    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    // Method to get the student's major
    public String getMajor() {
        return major;
    }

    // Method to represent the object as a string
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}

// Subclass Instructor
class Instructor extends Person {
    // Fields specific to Instructor
    private double salary;

    // Constructor
    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    // Method to get the instructor's salary
    public double getSalary() {
        return salary;
    }

    // Method to represent the object as a string
    public String toString() {
        return super.toString() + ", Salary: $" + salary;
    }
}

// Test program
public class TestProgram {
    public static void main(String[] args) {
        // Creating instances of Student and Instructor
        Student student = new Student("Alice", 2000, "Computer Science");
        Instructor instructor = new Instructor("Bob", 1985, 50000);

        // Printing information using toString() method
        System.out.println("Student: " + student.toString());
        System.out.println("Instructor: " + instructor.toString());
    }
}

