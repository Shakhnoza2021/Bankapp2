package ru.company.bank.bankAccount;

import ru.company.bank.client.Client;

public class BankAccount {
    private String accountNumber;
    private Client holder;
    private String currency;
    private double balance;

    public BankAccount(){}

    public BankAccount(String accountNumber, Client holder, String currency, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.currency = currency;
        this.balance = balance;
    }

    public double getMoney(double money){
        this.balance = this.balance - money;
        return money;
    }

    public void putMoney(double money){
        this.balance = this.balance + money;
    }

    public double getBalance() {
        return balance;
    }
}
