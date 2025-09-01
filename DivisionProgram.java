import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input two integers
            System.out.print("Enter numerator: ");
            int num1 = sc.nextInt();

            System.out.print("Enter denominator: ");
            int num2 = sc.nextInt();

            // Division operation
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("❌ Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("❌ Error: Please enter valid integers only.");
        } finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}
