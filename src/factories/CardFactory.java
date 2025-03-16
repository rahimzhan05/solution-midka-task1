package factories;

import payments.Card;
import payments.PaymentMethod;

public class CardFactory implements PaymentFactory {
    @Override
    public PaymentMethod create() {
        return new Card();
    }
}

