package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Challenge
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber(2324);
        myAccount.setBalance(2000.00d);
        myAccount.setCustomerName("Richard");
        myAccount.deposit(-400d);
        myAccount.deposit(4000d);
        myAccount.withdraw(6000d);
    }
}
