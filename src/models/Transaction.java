package models;

// Transaction Record to store history
public class Transaction {
    private final String method;
    private final double amount;
    public final Status status;

    public Transaction(String method, double amount, Status status) {
        this.method = method;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Payment: " + method + " | Amount: $" + amount + " | Status: " + status;
    }
}