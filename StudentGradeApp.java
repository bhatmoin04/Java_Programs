import java.util.InputMismatchException;
import java.util.Scanner;

// Step 1: Create interface
interface Grading {
    void calculateGrade();
}

// Step 2: Implement interface in Student class
class Student implements Grading {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public void calculateGrade() {
        String grade;
        if (marks >= 90)
            grade = "A+";
        else if (marks >= 80)
            grade = "A";
        else if (marks >= 70)
            grade = "B";
        else if (marks >= 60)
            grade = "C";
        else if (marks >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("Student: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

// Step 3: Main class
public class StudentGradeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            Student student = new Student(name, marks);
            student.calculateGrade();

        } catch (InputMismatchException e) {
            System.out.println("❌ Invalid input! Marks must be an integer.");
        } finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}
