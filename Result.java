package university.results;

import university.exams.Exam;

public class Result extends Exam {

    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name, m1, m2, m3); // call Exam constructor
    }

    private String calculateGrade() {
        double percentage = getPercentage();
        if (percentage >= 75)
            return "A";
        else if (percentage >= 60)
            return "B";
        else if (percentage >= 50)
            return "C";
        else if (percentage >= 35)
            return "D";
        else
            return "F (Fail)";
    }

    public void displayResult() {
        displayExam(); // from Exam
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Percentage: " + getPercentage() + "%");
        System.out.println("Grade: " + calculateGrade());
        System.out.println("---------------------------------");
    }
}
