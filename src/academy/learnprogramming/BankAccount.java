package academy.learnprogramming;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

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
}
