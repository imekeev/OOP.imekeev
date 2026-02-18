package Labka1.Problem2;

public class BankAccount {
    private final int id;
    private double balance;
    private AccountType type;
    private static int totalAccounts;
    {
        System.out.println("Creating new account...");
    }    
    public BankAccount(double balance , AccountType type){
        totalAccounts++;
        id = totalAccounts;
        this.balance = balance;
        this.type = type;

    }
    public void deposit(){
        balance+=100;
    }
    public void deposit(double amount){
        balance+=amount;

    }
}
