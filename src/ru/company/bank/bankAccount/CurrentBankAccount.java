package ru.company.bank.bankAccount;

import ru.company.bank.client.Client;

public class CurrentBankAccount extends BankAccount {
    private String cardNumber;

    public CurrentBankAccount(String accountNumber, Client holder, String currency, double balance, String cardNumber) {
        super(accountNumber, holder, currency, balance);
        this.cardNumber = cardNumber;
    }
}
