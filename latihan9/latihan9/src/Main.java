public class Main {

    static class PaymentMethod {
        public void processPayment(double amount) {
            System.out.println("Processing payment of " + amount);
        }

        public void processPayment(double amount, String currency) {
            System.out.println("Processing payment of " + amount + " in currency: " + currency);
        }
    }

    static class CreditCard extends PaymentMethod {
        @Override
        public void processPayment(double amount) {
            System.out.println("CreditCard: Paid " + amount);
        }

        @Override
        public void processPayment(double amount, String currency) {
            System.out.println("CreditCard: Paid " + amount + " " + currency);
        }
    }

    static class EWallet extends PaymentMethod {
        @Override
        public void processPayment(double amount) {
            System.out.println("EWallet: Paid " + amount);
        }

        @Override
        public void processPayment(double amount, String currency) { 
            System.out.println("EWallet: Paid " + amount + " " + currency);
        }
    }

    static class BankTransfer extends PaymentMethod {
        @Override
        public void processPayment(double amount) {
            System.out.println("BankTransfer: Paid " + amount);
        }

        @Override
        public void processPayment(double amount, String currency) {
            System.out.println("BankTransfer: Paid " + amount + " " + currency);
        }
    }

    public static void main(String[] args) {
        PaymentMethod[] payments = {
            new CreditCard(),
            new EWallet(),
            new BankTransfer()
        };

        for (PaymentMethod payment : payments) {
            payment.processPayment(85.0);
            payment.processPayment(100.0, "USD");
            System.out.println();
        }
    }
}
