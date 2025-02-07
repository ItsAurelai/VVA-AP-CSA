/**
 * This class represents a Student with attributes like name, student ID, and grade.
 */
public class Student {

    // Instance variables
    private String name;
    private int studentId;
    private double grade;

    // Static variable to keep track of object count
    private static int objectCount = 0;

    /**
     * Constructor to initialize student object with name, student ID, and grade.
     *
     * @param name      Student's name
     * @param studentId Student's ID
     * @param grade     Student's grade
     */
    public Student(String name, int studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
        objectCount++; // Increment object count on object creation
    }

    /**
     * Prints the current count of Student objects created.
     */
    public static void printObjectCount() {
        System.out.println("Number of Student objects created: " + objectCount);
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * Returns a string representation of the Student object.
     *
     * @return String containing student information
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }

    /**
     * Calculates the letter grade based on the numerical grade.
     *
     * @return Letter grade (e.g., "A", "B", "C")
     */
    public String calculateLetterGrade() {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Alice", 12345, 95.5);
        Student student2 = new Student("Bob", 54321, 82.0);

        // Print object count
        Student.printObjectCount();

        // Access and print student information
        System.out.println(student1);
        System.out.println(student2);

        // Call mutator methods to update student information
        student1.setGrade(98.0);
        System.out.println(student1);

        // Call calculateLetterGrade method
        System.out.println("Student 1 Letter Grade: " + student1.calculateLetterGrade());
        System.out.println("Student 2 Letter Grade: " + student2.calculateLetterGrade());
    }
}