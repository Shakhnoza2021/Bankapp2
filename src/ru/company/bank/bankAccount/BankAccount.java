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
        if (this.balance > 0 && this.balance >= money) {
            this.balance = this.balance - money;
            System.out.println("Снятие со счета " + money + " руб.");
            return money;
        } else {
            System.out.println("Снятие со счета " + money + " руб. Недостаточно средств.");
            return 0;
        }
    }

    public void putMoney(double money){
        this.balance = this.balance + money;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
