package com.atm.transaction;

import com.atm.model.Account;
import java.util.Scanner;

public class Deposit extends Transaction {
    private Scanner scanner;

    public Deposit(Account account, Scanner scanner) {
        super(account);
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print("Masukkan jumlah deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            account.credit(amount);
            System.out.println("Deposit berhasil. Saldo Anda sekarang: " + account.getBalance());
        } else {
            System.out.println("Jumlah deposit tidak valid.");
        }
    }
}
