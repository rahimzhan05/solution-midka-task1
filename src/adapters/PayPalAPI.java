package adapters;

// Adapter Pattern - Mock External API
class PayPalAPI {
    public boolean validateAccount(String email) {
        return email.contains("@") && email.contains(".com");
    }
}
