import java.util.InputMismatchException;
import java.util.Scanner;

// Step 1: Define interface
interface Calculator {
    int add(int a, int b);

    int subtract(int a, int b);

    int multiply(int a, int b);

    double divide(int a, int b);
}

// Step 2: Implement in class
class SimpleCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("❌ Cannot divide by zero!");
        }
        return (double) a / b;
    }
}

// Step 3: Main class to test
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new SimpleCalculator();

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("Addition: " + calc.add(num1, num2));
            System.out.println("Subtraction: " + calc.subtract(num1, num2));
            System.out.println("Multiplication: " + calc.multiply(num1, num2));

            try {
                System.out.println("Division: " + calc.divide(num1, num2));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("❌ Invalid input! Please enter integers only.");
        } finally {
            sc.close();
            System.out.println("✅ Program ended.");
        }
    }
}
