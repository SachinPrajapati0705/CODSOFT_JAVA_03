package CODSOFT_JAVA_02;

import java.util.Scanner;

public class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM.");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void processOption(int option) {
        switch (option) {
            case 1:
                withdraw();
                break;
            case 2:
                deposit();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thank you for using the ATM.");
                System.exit(0);
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        account.withdraw(amount);
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        account.deposit(amount);
    }

    private void checkBalance() {
        System.out.println("Current balance: $" + account.getBalance());
    }
}

