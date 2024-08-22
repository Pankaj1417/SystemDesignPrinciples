package solid_principles.open_close_principle.extra_composition;

// Interface for PaymentMethod
interface PaymentMethod {
    void process(double amount);
}

// Concrete class for CreditCardPaymentMethod
class CreditCardPaymentMethod implements PaymentMethod {
    @Override
    public void process(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// Concrete class for PayPalPaymentMethod
class PayPalPaymentMethod implements PaymentMethod {
    @Override
    public void process(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// Payment class that uses composition
class Payment {
    private PaymentMethod paymentMethod;

    public Payment(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    void processPayment(double amount) {
        paymentMethod.process(amount);
    }
}

// Client code
class PaymentProcessor {
    void processPayment(Payment payment, double amount) {
        payment.processPayment(amount);
    }
}
