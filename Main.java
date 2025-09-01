// Student.java
class Student {
    // Attributes of the Student class
    int rollNo;
    String name;
    float marks;

    // Constructor to initialize student details
    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------------");
    }
}

// Main class to test Student objects
public class Main {
    public static void main(String[] args) {
        // Creating multiple student objects
        Student s1 = new Student(1, "Alice", 85.5f);
        Student s2 = new Student(2, "Bob", 90.0f);
        Student s3 = new Student(3, "Charlie", 78.25f);

        // Displaying details of each student
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
