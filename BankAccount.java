class BankAccount {
    // Fields
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
        System.out.println("-----------------------------");
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account1 = new BankAccount("AC12345", "Alice", 1000.0);

        // Display initial balance
        account1.displayBalance();

        // Deposit money
        account1.deposit(500);
        account1.displayBalance();

        // Withdraw money
        account1.withdraw(300);
        account1.displayBalance();

        // Attempt to withdraw more than balance
        account1.withdraw(1500);
        account1.displayBalance();
    }
}
