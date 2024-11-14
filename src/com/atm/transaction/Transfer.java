package com.atm.transaction;

import com.atm.model.Account;
import java.util.Scanner;

public class Transfer extends Transaction {
    private Account targetAccount;
    private Scanner scanner;

    public Transfer(Account account, Account targetAccount, Scanner scanner) {
        super(account);
        this.targetAccount = targetAccount;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print("Masukkan jumlah transfer: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= account.getBalance()) {
            account.debit(amount);
            targetAccount.credit(amount);
            System.out.println("Transfer berhasil. Saldo Anda sekarang: " + account.getBalance());
        } else if (amount <= 0) {
            System.out.println("Jumlah transfer tidak valid.");
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }
}
