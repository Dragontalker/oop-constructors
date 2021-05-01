package academy.learnprogramming;

import com.sun.jdi.StringReference;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        System.out.println("Empty constructor called");
    }

    public BankAccount(
            int accountNumber,
            double balance,
            String customerName,
            String email,
            String phoneNumber
            ) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int number) {
        this.accountNumber = number;
    }

    public void setBalance(double number) {
        this.balance = number;
    }

    public void setCustomerName(String string) {
        this.customerName = string;
    }

    public void setEmail(String string) {
        this.email = string;
    }

    public void setPhoneNumber(String string) {
        this.phoneNumber = string;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit completed! The current balance is $" + this.balance);
        } else {
            System.out.println("Please enter a positive amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdraw completed! The current balance is $" + this.balance);
        } else {
            System.out.println("Insufficient found, please check your balance");
        }
    }
}
