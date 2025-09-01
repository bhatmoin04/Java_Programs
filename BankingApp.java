package bank.main;

import java.util.Scanner;
import bank.customers.Customer;
import bank.accounts.SavingsAccount;
import bank.accounts.CurrentAccount;
import bank.accounts.Account;
import bank.services.BankServices;

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankServices bankServices = new BankServices();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        Customer customer = new Customer(name, id);

        System.out.println("Choose Account Type: 1. Savings  2. Current");
        int choice = sc.nextInt();
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account account;
        if (choice == 1) {
            account = new SavingsAccount(customer, accNo, balance);
        } else {
            account = new CurrentAccount(customer, accNo, balance);
        }

        int option;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Display Account Info\n5. Exit");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    bankServices.deposit(account, dep);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double wd = sc.nextDouble();
                    bankServices.withdraw(account, wd);
                    break;
                case 3:
                    bankServices.checkBalance(account);
                    break;
                case 4:
                    account.accountType();
                    account.displayAccountInfo();
                    break;
                case 5:
                    System.out.println("Thank you for banking!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (option != 5);

        sc.close();
    }
}
