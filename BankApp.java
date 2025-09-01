import java.util.Scanner;

// Step 1: Define interface
interface BankAccount {
    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();
}

// Step 2: Implement SavingsAccount
class SavingsAccount implements BankAccount {
    private double balance;

    SavingsAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Set to 0.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("❌ Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        try {
            if (amount <= 0) {
                throw new ArithmeticException("Withdrawal amount must be positive.");
            }
            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance.");
            }
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } catch (ArithmeticException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Step 3: Main class
public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter initial balance: ");
            double initialBalance = sc.nextDouble();
            BankAccount account = new SavingsAccount(initialBalance);

            // Deposit
            System.out.print("Enter amount to deposit: ");
            double dep = sc.nextDouble();
            account.deposit(dep);

            // Withdraw
            System.out.print("Enter amount to withdraw: ");
            double wd = sc.nextDouble();
            account.withdraw(wd);

            // Final Balance
            System.out.println("Final Balance: " + account.getBalance());

        } catch (Exception e) {
            System.out.println("❌ Invalid input! Please enter numeric values.");
        } finally {
            sc.close();
        }
    }
}
