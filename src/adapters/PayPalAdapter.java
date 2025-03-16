package adapters;

import models.Status;
import models.Transaction;
import payments.PaymentMethod;

public class PayPalAdapter implements PaymentMethod {
    private final PayPalAPI paypalAPI = new PayPalAPI();
    private final String email;

    public PayPalAdapter(String email) {
        this.email = email;
    }

    @Override
    public Transaction pay(double amount) {
        if (!paypalAPI.validateAccount(email)) {
            return new Transaction("PayPal", amount, Status.ERROR);
        }
        return new Transaction("PayPal", amount, amount > 0 ? Status.SUCCESS : Status.ERROR);
    }
}
