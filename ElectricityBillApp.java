import java.util.InputMismatchException;
import java.util.Scanner;

// Step 1: Define interface
interface BillCalculator {
    void calculateBill(int units);
}

// Step 2: Implement interface
class ElectricityBoard implements BillCalculator {

    @Override
    public void calculateBill(int units) {
        double bill = 0;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = 100 * 5 + (units - 100) * 7;
        } else {
            bill = 100 * 5 + 100 * 7 + (units - 200) * 10;
        }

        System.out.println("Total units: " + units);
        System.out.println("Electricity Bill: ₹" + bill);
    }
}

// Step 3: Main class
public class ElectricityBillApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillCalculator calculator = new ElectricityBoard();

        try {
            System.out.print("Enter number of units consumed: ");
            int units = sc.nextInt();

            calculator.calculateBill(units);

        } catch (InputMismatchException e) {
            System.out.println("❌ Invalid input! Please enter numeric values.");
        } finally {
            sc.close();
            System.out.println("✅ Program ended.");
        }
    }
}
