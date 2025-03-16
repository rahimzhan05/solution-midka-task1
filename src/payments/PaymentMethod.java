package payments;

import models.Transaction;

// Payment Interface
public interface PaymentMethod {
    Transaction pay(double amount);
}