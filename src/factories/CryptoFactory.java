package factories;

import payments.Crypto;
import payments.PaymentMethod;

public class CryptoFactory implements PaymentFactory {
    @Override
    public PaymentMethod create() {
        return new Crypto();
    }
}