public class Student {
    int rno;
    int marks;
    String name;

    Student(int rno, int marks, String name) {
        this.rno = rno;
        this.marks = marks;
        this.name = name;
    }

    void displayDetails() {
        System.out.println("Roll no is :" + rno);
        System.out.println("Marks are :" + marks);
        System.out.println("Name is :" + name);
    }

    public static void main(String[] args) {
        Student s = new Student(4, 99, "Toiba");
        s.displayDetails();
    }
}