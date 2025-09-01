import java.util.Scanner;

class UnderAgeException extends Exception {
    public UnderAgeException(String m) {
        super(m);
    }
}

class validateage {
    public void ageValidate(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("Age less than 18");
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        validateage a = new validateage();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter age");
            int age = scanner.nextInt();
            a.ageValidate(age);
        } catch (UnderAgeException u) {
            System.out.println("This is exception");
        }
    }

}
