import java.util.Scanner;

// Step 1: Define interface
interface Checkout {
    void processPayment(double amount);
}

// Step 2: Implement interface
class OnlineCart implements Checkout {

    @Override
    public void processPayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("❌ Payment amount must be greater than zero.");
        }
        System.out.println("Payment of $" + amount + " processed successfully!");
    }
}

// Step 3: Main class to test
public class ECommerceCheckout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Checkout cart = new OnlineCart();

        try {
            System.out.print("Enter payment amount: ");
            double amount = sc.nextDouble();

            cart.processPayment(amount);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Invalid input! Please enter a numeric value.");
        } finally {
            sc.close();
            System.out.println("✅ Program ended.");
        }
    }
}
