package ru.company.bank;

import ru.company.bank.bankAccount.BankAccount;
import ru.company.bank.client.Client;
import ru.company.bank.staff.*;

public class Bank {
    String bankName;
    BankTeller bankTeller;
    Consultant consultant;
    Director director;
    Cashier cashier;
    ATM atm;
    private Staff staff[];

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankTeller = new BankTeller("Евгения", "Иванова", "Операционист");
        this.consultant = new Consultant("Ольга", "Петрова", "Консультант");
        this.director = new Director("Анастасия", "Максимова", "Руководитель");
        this.cashier = new Cashier("Сергей", "Николаев", "Кассир");
        this.atm = new ATM();
        staff = new Staff[]{director, bankTeller, cashier, consultant};
    }

    public BankAccount openAccount(Client client, String accountType){
        return bankTeller.openAccount(client, accountType);
    }

    public double getMoneyFromATM(Client client, double sum){
        return atm.getMoney(client.getAccount(), sum);
    }

    public Staff[] getStaff() {
        return staff;
    }
}
