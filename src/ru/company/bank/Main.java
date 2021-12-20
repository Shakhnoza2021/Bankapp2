package ru.company.bank;

import ru.company.bank.bankAccount.BankAccount;
import ru.company.bank.client.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Мария", "Сергеева", "696547");
        Bank sberbank = new Bank("Сбербанк");
        BankAccount bankAccount = sberbank.openAccount(client, "CURRENT");
        client.setAccount(bankAccount);

        client.putMoneyIntoAccount(bankAccount, 5000);
        System.out.println("Баланс счета: " + client.getTheAccountBalance());

        client.getMoney(sberbank, 2000);
        System.out.println("Баланс счета: " + client.getTheAccountBalance());
    }
}
