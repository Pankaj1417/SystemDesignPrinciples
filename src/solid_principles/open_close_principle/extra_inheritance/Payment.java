package solid_principles.open_close_principle.extra_inheritance;

// Abstract class representing a generic Payment
abstract class Payment {
    abstract void processPayment(double amount);
}

// Concrete class for CreditCardPayment
class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// Concrete class for PayPalPayment
class PayPalPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// Client code
class PaymentProcessor {
    void processPayment(Payment payment, double amount) {
        payment.processPayment(amount);
    }
}
