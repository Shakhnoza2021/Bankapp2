package ru.company.bank.productsAndSevices;

import ru.company.bank.bankAccount.BankAccount;

public class PaymentOperations extends ProductsAndServices{
    public boolean payForInternetServices(BankAccount account, double sumOfPayment){
        if (account.getBalance() >= sumOfPayment) {
            account.setBalance(account.getBalance() - sumOfPayment);
            return true;
        }
        else return false;
    }
}
