package payments;

import models.Status;
import models.Transaction;

public class Crypto implements PaymentMethod {
    @Override
    public Transaction pay(double amount) {
        return new Transaction("Crypto", amount, amount > 0 ? Status.SUCCESS : Status.ERROR);
    }
}