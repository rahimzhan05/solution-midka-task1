package payments;

import models.Status;
import models.Transaction;

// Concrete Payment Methods
public class Card implements PaymentMethod {
    @Override
    public Transaction pay(double amount) {
        return new Transaction("Card", amount, amount > 0 ? Status.SUCCESS : Status.ERROR);
    }
}




















