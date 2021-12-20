package ru.company.bank;

import ru.company.bank.bankAccount.BankAccount;
import ru.company.bank.client.Client;
import ru.company.bank.staff.BankTeller;
import ru.company.bank.staff.Cashier;
import ru.company.bank.staff.Consultant;
import ru.company.bank.staff.Director;

public class Bank {
    String bankName;
    BankTeller bankTeller;
    Consultant consultant;
    Director director;
    Cashier cashier;
    ATM atm;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankTeller = new BankTeller("Евгения", "Иванова", "Операционный отдел");
        this.consultant = new Consultant("Ольга", "Петрова", "");
        this.director = new Director("Анастасия", "Максимова", "");
        this.cashier = new Cashier("Сергей", "Николаев", "");
        this.atm = new ATM();
    }

    public BankAccount openAccount(Client client, String accountType){
        return bankTeller.openAccount(client, accountType);
    }

    public double getMoneyFromATM(Client client, double sum){
        return atm.getMoney(client.getAccount(), sum);
    }
}
