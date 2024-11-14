package com.atm.transaction;

import com.atm.model.Account;
import java.util.Scanner;

public class Withdrawal extends Transaction {
    private static final double MAX_WITHDRAWAL_AMOUNT = 450000;
    private Scanner scanner;

    public Withdrawal(Account account, Scanner scanner) {
        super(account);
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print("Masukkan jumlah penarikan: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Jumlah penarikan tidak valid.");
        } else if (amount > MAX_WITHDRAWAL_AMOUNT) {
            System.out.println("Penarikan gagal. Maksimal penarikan adalah Rp" + MAX_WITHDRAWAL_AMOUNT);
        } else if (amount > account.getBalance() - Account.MINIMUM_BALANCE) {
            System.out.println("Penarikan gagal. Anda harus menyisakan minimal Rp" + Account.MINIMUM_BALANCE + " di akun Anda.");
        } else {
            account.debit(amount);
            System.out.println("Penarikan berhasil. Saldo Anda sekarang: Rp" + account.getBalance());
        }
    }
}
