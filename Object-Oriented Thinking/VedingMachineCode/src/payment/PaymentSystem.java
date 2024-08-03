package payment;

import java.util.Arrays;
import java.util.List;

public class PaymentSystem {
    private List<String> supportedMethods;

    public PaymentSystem() {
        this.supportedMethods = Arrays.asList("Cash", "Credit Card", "Mobile Payment");
    }

    public boolean processPayment(double amount, String method) {
        if (!validatePayment(method)) {
            return false;
        }
        // Simulate payment processing
        System.out.println("Processing payment of $" + amount + " via " + method);
        return true;
    }

    public void giveChange(double amount) {
        System.out.println("Dispensing change: $" + amount);
    }

    public boolean validatePayment(String method) {
        return supportedMethods.contains(method);
    }
}

