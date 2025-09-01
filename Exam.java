package university.exams;

import university.students.Student;

public class Exam extends Student {
    protected int marks1, marks2, marks3;

    public Exam(int rollNo, String name, int marks1, int marks2, int marks3) {
        super(rollNo, name); // call Student constructor
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    public double getPercentage() {
        return getTotalMarks() / 3.0;
    }

    public void displayExam() {
        displayStudent();
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
    }
}
