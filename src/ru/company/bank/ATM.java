package ru.company.bank;

import ru.company.bank.bankAccount.BankAccount;
import ru.company.bank.client.Client;

public class ATM {

    public double getMoney(BankAccount bankAccount, double sum){
        //System.out.println("Снятие со счета " + sum + " руб.");
        return bankAccount.getMoney(sum);
    }
}
