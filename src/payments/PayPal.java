package payments;

import models.Status;
import models.Transaction;

public class PayPal implements PaymentMethod {
    @Override
    public Transaction pay(double amount) {
        return new Transaction("PayPal", amount, amount > 0 ? Status.SUCCESS : Status.ERROR);
    }
}
