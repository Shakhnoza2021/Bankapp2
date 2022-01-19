package ru.company.bank.client;

import ru.company.bank.Bank;
import ru.company.bank.bankAccount.BankAccount;

public class Client {
    private int id;
    private String name;
    private String lastname;
    private String passportNum;
    private BankAccount account;

    public Client(String name, String lastname, String passportNum) {
        id++;
        this.name = name;
        this.lastname = lastname;
        this.passportNum = passportNum;
    }

    public void putMoneyIntoAccount(BankAccount bankAccount, double sum){
        bankAccount.putMoney(sum);
        System.out.println("Пополнение счета на " + sum + " руб.");
    }

    public void payForInternetServices(Bank bank, double sumOfPayment){
        bank.payForInternetServices(this, sumOfPayment);
    }

    public double getTheAccountBalance(){
        return account.getBalance();
    }

    public double getMoney(Bank bank, double sum){
        return bank.getMoneyFromATM(this,sum);
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

}
