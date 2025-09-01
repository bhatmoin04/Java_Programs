import java.util.Scanner;

public class SwapUsingXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Step 1: a = a ^ b
        a = a ^ b;
        System.out.println("Step 1: a = a ^ b -> a = " + a + ", b = " + b);

        // Step 2: b = a ^ b
        b = a ^ b;
        System.out.println("Step 2: b = a ^ b -> a = " + a + ", b = " + b);

        // Step 3: a = a ^ b
        a = a ^ b;
        System.out.println("Step 3: a = a ^ b -> a = " + a + ", b = " + b);

        System.out.println("After swapping: a = " + a + ", b = " + b);

        sc.close();
    }
}
