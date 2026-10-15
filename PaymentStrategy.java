public interface PaymentStrategy {
    String getName();

    double calculateTotal(double amount);
}