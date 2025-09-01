package bank.services;

import bank.accounts.Account;

public class BankServices {

    public void deposit(Account account, double amount) {
        if (amount > 0) {
            account.balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + account.getBalance());
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(Account account, double amount) {
        if (amount > 0 && amount <= account.getBalance()) {
            account.balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New Balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void checkBalance(Account account) {
        System.out.println("Account Balance: " + account.getBalance());
    }
}
