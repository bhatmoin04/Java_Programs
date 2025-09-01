import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two integers as input
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        // Bitwise AND
        int andResult = num1 & num2;
        System.out.println("AND: " + andResult + " -> " + Integer.toBinaryString(andResult));

        // Bitwise OR
        int orResult = num1 | num2;
        System.out.println("OR: " + orResult + " -> " + Integer.toBinaryString(orResult));

        // Bitwise XOR
        int xorResult = num1 ^ num2;
        System.out.println("XOR: " + xorResult + " -> " + Integer.toBinaryString(xorResult));

        // Bitwise NOT for both numbers
        int notNum1 = ~num1;
        int notNum2 = ~num2;
        System.out.println("NOT num1: " + notNum1 + " -> " + Integer.toBinaryString(notNum1));
        System.out.println("NOT num2: " + notNum2 + " -> " + Integer.toBinaryString(notNum2));

        // Left Shift
        int leftShiftNum1 = num1 << 1;
        int leftShiftNum2 = num2 << 1;
        System.out.println("num1 << 1: " + leftShiftNum1 + " -> " + Integer.toBinaryString(leftShiftNum1));
        System.out.println("num2 << 1: " + leftShiftNum2 + " -> " + Integer.toBinaryString(leftShiftNum2));

        // Right Shift
        int rightShiftNum1 = num1 >> 1;
        int rightShiftNum2 = num2 >> 1;
        System.out.println("num1 >> 1: " + rightShiftNum1 + " -> " + Integer.toBinaryString(rightShiftNum1));
        System.out.println("num2 >> 1: " + rightShiftNum2 + " -> " + Integer.toBinaryString(rightShiftNum2));

        sc.close();
    }
}
