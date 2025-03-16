package factories;

import payments.PayPal;
import payments.PaymentMethod;

class PayPalFactory implements PaymentFactory {
    @Override
    public PaymentMethod create() {
        return new PayPal();
    }
}
