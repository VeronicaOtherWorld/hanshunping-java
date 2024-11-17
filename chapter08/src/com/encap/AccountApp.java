package com.encap;

public class AccountApp {
    public static void main(String[] args) {
        Account account = new Account("sasa", "555555", 22);
        account.setName("l2i");
        account.setPassword("22");
        account.setBalance(2);
        System.out.println(account.getName());
        System.out.println(account.getPassword());
        System.out.println(account.getBalance());
    }
}
