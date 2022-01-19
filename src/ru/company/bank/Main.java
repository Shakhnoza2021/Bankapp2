package ru.company.bank;

import ru.company.bank.bankAccount.BankAccount;
import ru.company.bank.client.Client;
import ru.company.bank.staff.Staff;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Мария", "Сергеева", "696547");
        Bank sberbank = new Bank("Сбербанк");
        for (Staff staff: sberbank.getStaff()) {
            System.out.println(staff.getLastName() + " " + staff.getName() + " - " + staff.getPosition());
        }
        System.out.println("----------------------------------");
        BankAccount bankAccount = sberbank.openAccount(client, "CURRENT");
        client.setAccount(bankAccount);

        client.putMoneyIntoAccount(bankAccount, 7000);
        System.out.println("Баланс счета: " + client.getTheAccountBalance());

        client.getMoney(sberbank, 9000);
        System.out.println("Баланс счета: " + client.getTheAccountBalance());

        client.payForInternetServices(sberbank, 500);
    }
}
