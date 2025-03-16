import factories.CardFactory;
import factories.CryptoFactory;
import models.Status;
import models.Transaction;
import services.PaymentService;

import java.util.Scanner;

// Main Method for Interactive Console
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentService service = new PaymentService();
        double balance = 100.00;

        while (true) {
            System.out.println("\n\uD83D\uDCBC Төлем жүйесі | Баланс: $" + balance);
            System.out.println("1️⃣ Төлем жасау");
            System.out.println("2️⃣ Транзакция тарихын көру");
            System.out.println("3️⃣ Шығу");
            System.out.print("👉 Таңдауыңызды енгізіңіз: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    balance = processUserPayment(scanner, service, balance);
                    break;
                case 2:
                    service.showHistory();
                    break;
                case 3:
                    System.out.println("🚪 Бағдарлама жабылды.");
                    scanner.close();
                    return;
                default:
                    System.out.println("❌ Қате! Қайтадан енгізіңіз.");
            }
        }
    }

    private static double processUserPayment(Scanner scanner, PaymentService service, double balance) {
        System.out.println("\n💳 Төлем әдісін таңдаңыз:");
        System.out.println("1️⃣ Кредит картасы");
        System.out.println("2️⃣ PayPal");
        System.out.println("3️⃣ Криптовалюта");
        System.out.print("👉 Таңдау: ");

        int paymentChoice = scanner.nextInt();
        System.out.print("💰 Төлем сомасын енгізіңіз: ");
        double amount = scanner.nextDouble();

        Transaction transaction = null;

        switch (paymentChoice) {
            case 1:
                transaction = service.processPayment(new CardFactory(), amount, balance);
                break;
            case 2:
                System.out.print("📧 PayPal Email енгізіңіз: ");
                String email = scanner.next();
                transaction = service.processPayPalPayment(email, amount, balance);
                break;
            case 3:
                transaction = service.processPayment(new CryptoFactory(), amount, balance);
                break;
            default:
                System.out.println("❌ Қате! Қайтадан таңдаңыз.");
                return balance;
        }

        System.out.println("✅ Төлем нәтижесі: " + transaction);
        return transaction.status == Status.SUCCESS ? balance - amount : balance;
    }
}