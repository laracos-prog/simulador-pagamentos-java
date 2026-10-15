public class PixPayment implements PaymentStrategy {

    @Override
    public String getName() {
        return "PIX";
    }

    @Override
    public double calculateTotal(double amount) {
        return amount * 0.95;
    }
}