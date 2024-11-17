package com.homework.Homework08;

public class HomeWork08 {
    public static void main(String[] args) {
        BankAccount bank = new CheckingAccount(100);
        CheckingAccount checking = (CheckingAccount) bank;
        BankAccount bank2 = new SavingsAccount(200);
        SavingsAccount savings = (SavingsAccount) bank2;


    }
}

class BankAccount{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }
    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }
}

class SavingsAccount extends BankAccount {
    private int count = 3;
    public SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    public void deposit(double amount) {

        if(count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

}