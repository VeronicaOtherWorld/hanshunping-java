package com.encap;
// account have attribute,
/*
* name: length 2-4
* balance: >20
* password: 6位
* */
public class Account {
    private String name;
    private String password;
    private int balance;

    public Account() {

    }

    public Account(String name, String password, int balance) {
        setName(name);
        setPassword(password);
        setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("Invalid name, try again");
            this.name = "lisa";
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6) {
            this.password = password;
        } else {
            this.password = "123456";
            System.out.println("Invalid password, try again");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance > 20) {
            this.balance = balance;
        } else {
            this.balance = 21;
            System.out.println("Invalid balance, try again");
        }
    }
}
