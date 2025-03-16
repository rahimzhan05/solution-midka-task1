package factories;

import payments.PaymentMethod;

// Factory Pattern
public interface PaymentFactory {
    PaymentMethod create();
}
