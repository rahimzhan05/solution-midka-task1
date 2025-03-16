package services;


import adapters.PayPalAdapter;
import factories.PaymentFactory;
import models.Status;
import models.Transaction;
import payments.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

// Payment Service
public class PaymentService {
    private final List<Transaction> history = new ArrayList<>();

    public Transaction processPayment(PaymentFactory factory, double amount, double balance) {
        if (amount > balance) {
            System.out.println("\u26A0 Қате! Баланс жеткіліксіз.");
            return new Transaction(factory.create().getClass().getSimpleName(), amount, Status.ERROR);
        }
        PaymentMethod method = factory.create();
        Transaction transaction = method.pay(amount);
        history.add(transaction);
        return transaction;
    }

    public Transaction processPayPalPayment(String email, double amount, double balance) {
        if (amount > balance) {
            System.out.println("\u26A0 Қате! Баланс жеткіліксіз.");
            return new Transaction("PayPal", amount, Status.ERROR);
        }
        PaymentMethod method = new PayPalAdapter(email);
        Transaction transaction = method.pay(amount);
        history.add(transaction);
        return transaction;
    }

    public void showHistory() {
        System.out.println("\n\uD83D\uDCCB Транзакция тарихы:");
        for (Transaction record : history) {
            System.out.println(record);
        }
    }
}
