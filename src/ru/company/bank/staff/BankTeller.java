package ru.company.bank.staff;

import ru.company.bank.bankAccount.BankAccount;
import ru.company.bank.bankAccount.CreditBankAccount;
import ru.company.bank.bankAccount.CurrentBankAccount;
import ru.company.bank.bankAccount.DepositBankAccount;
import ru.company.bank.client.Client;

public class BankTeller extends Staff {

    public BankTeller(String name, String lastName, String position) {
        super(name, lastName, position);
    }

    public BankAccount openAccount(Client client, String accountType) {
        if (accountType.equals("CREDIT"))
            return new CreditBankAccount();
        if (accountType.equals("CURRENT")) {
            System.out.println("Открытие счета. Клиент: " + client.getName() + " " + client.getLastname());
            return new CurrentBankAccount("12345", client, "RUB", 0, "5432765");
        } else return new DepositBankAccount();
    }
}